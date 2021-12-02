package tools;

import dataStructure.VarType.Array;
import dataStructure.VarType.Function;
import dataStructure.Var;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

import dataStructure.nodeInStack;
import dataStructure.basicFinal;

public class VarsManager {
    private final Stack<HashMap<String, Var>> localMapStack = new Stack<>();

    public VarsManager() {
        HashMap<String, Var> globalMap = new HashMap<>();
        globalMap.put("getint", new Var("getint", basicFinal.FUNCTION, null,
                new Function("getint", basicFinal.I32, null)));
        globalMap.put("putint", new Var("putint", basicFinal.FUNCTION, null,
                new Function("putint", basicFinal.VOID, new String[]{"int"})));
        globalMap.put("putch", new Var("putch", basicFinal.FUNCTION, null,
                new Function("putch", basicFinal.VOID, new String[]{"int"})));
        globalMap.put("getch", new Var("getch", basicFinal.FUNCTION, null,
                new Function("getch", basicFinal.I32, null)));
        globalMap.put("memset", new Var("memset", basicFinal.FUNCTION, null,
                new Function("memset", basicFinal.VOID, new String[]{"int*", "int", "int"})));
        localMapStack.push(globalMap);
    }

    public void enterBlock() {
        localMapStack.push(new HashMap<>());
    }

    public void exitBlock() {
        localMapStack.pop();
    }

    public boolean checkVarConflict(String VarName) {
        return localMapStack.peek().get(VarName) != null;
    }

    public String addVar(String VarName, int varType, RegisterManager reg, llvmCmdBuffer buffer) {
        if (this.checkVarConflict(VarName)) {
            System.err.println("变量定义冲突！\n");
            System.exit(5);
            return null;
        } else {
            Var newVar;
            String newSpace;
            if (localMapStack.size() > 1) {
                newSpace = reg.allocateVar();
                newVar = new Var(VarName, varType, newSpace);
                buffer.addToAllocateBuffer(newVar.getRegisCode() + " = " + "alloca " + "i32");
            } else {
                System.out.println("@" + VarName + " = " + "dso_local global i32 0");
                newSpace = "@" + VarName;
                newVar = new Var(VarName, varType, newSpace);
            }
            localMapStack.peek().put(VarName, newVar);
            return newSpace;
        }
    }

    public String addVar(String VarName, int varType, RegisterManager reg,
                         nodeInStack initValue, llvmCmdBuffer buffer) {
        if (localMapStack.size() > 1) {
            String thisRegCode = addVar(VarName, varType, reg, buffer);
            buffer.addToOperateBuffer("store i32 " + initValue.getContext() + "," + "i32* " + thisRegCode);
            return thisRegCode;
        } else {
            if (this.checkVarConflict(VarName)) {
                System.err.println("变量定义冲突！\n");
                System.exit(5);
                return null;
            }
            if (!initValue.isConst()) {
                System.err.println("全局变量声明为非常值！");
                System.exit(11);
            }
            System.out.println("@" + VarName + " = " + "dso_local global i32 " + initValue.getContext());
            Var newVar = new Var(VarName, varType, "@" + VarName);
            localMapStack.peek().put(VarName, newVar);
            return "@" + VarName;
        }
    }

    public String addFunction(String FuncName, int retType, String[] params) {
        if (consultVar(FuncName) != null) {
            System.err.println("自定义函数名与现有变量表冲突！");
            System.exit(5);
        }
        Function funcInfo = new Function(FuncName, retType, params);
        Var thisFunc = new Var(FuncName, basicFinal.FUNCTION, null, funcInfo);
        localMapStack.peek().put(FuncName, thisFunc);
        return "@" + FuncName;
    }

    public String addArray(String ArrayName, int type, RegisterManager reg, llvmCmdBuffer buffer,
                           int... dims) {
        Array thisArray = new Array(type, dims);
        int size = 1;
        for (int dim : dims) {
            size *= dim;
        }
        String thisPointer;
        Var thisVar;
        if (localMapStack.size() > 1) {
            thisPointer = reg.allocateVar();
            thisVar = new Var(ArrayName, basicFinal.ARRAY, thisPointer, thisArray);
            int dimension = dims.length;
            StringBuilder arrayInitial = new StringBuilder();

            arrayInitial.append("[ ").append(size).append(" x ").append(basicFinal.getStringTypeByInt(type)).append(" ]");
            buffer.addToAllocateBuffer(thisPointer + " = " + "alloca " + arrayInitial + ", i32 " + size);
            localMapStack.peek().put(ArrayName, thisVar);
            return thisPointer;
        } else {
            thisPointer = "@" + ArrayName;
            thisVar = new Var(ArrayName, basicFinal.ARRAY, thisPointer, thisArray);
            System.out.println(thisPointer + " = dso_local global " + "[ " + size + " x " + basicFinal.getStringTypeByInt(type)
                    + " ] zeroinitializer, align 16");
        }
        localMapStack.peek().put(ArrayName, thisVar);
        return thisPointer;
    }

    public Var consultVar(String VarName) {
        int size = localMapStack.size();
        Var result;
        for (int i = size - 1; i >= 0; i--) {
            if ((result = localMapStack.get(i).get(VarName)) != null) {
                return result;
            }
        }
        return null;
    }

    public void ArrayInitializer(Var array, nodeInStack root, llvmCmdBuffer buffer,
                                 RegisterManager reg, VarsManager varsManager) {
        if(!root.isConst() && localMapStack.size()==1){
            System.err.println("全局变量初始值必须为常量！");
            System.exit(13);
        }
        assert (array.getInfo() instanceof Array);
        Array arrayInfo = (Array) array.getInfo();
        int size = arrayInfo.getSize();
        ArrayList<String> params = new ArrayList<>();
        String thisRegSpace = reg.allocateTemperSpace();
        BasicLlvmPrinter.printGEP("[" + ((Array) array.getInfo()).getSize() +
                " x i32]", array.getRegisCode(), thisRegSpace, 0, buffer);
        params.add(thisRegSpace);
        params.add("0");
        params.add(Integer.toString(size * 4));
        if(localMapStack.size()>1) Calculator.FunctionCaller("memset", params, buffer, reg, varsManager);//全部初始化为0
        arrayInitialWalker(root, array, arrayInfo.getDims(), new ArrayList<>(), reg, buffer);


    }

    private void arrayInitialWalker(nodeInStack thisNode, Var varInfo, ArrayList<Integer> dims
            , ArrayList<Integer> currentDims, RegisterManager reg, llvmCmdBuffer buffer) {
        int count = thisNode.getChildCount();
        int currentDim = currentDims.size();
        if (currentDim == dims.size() - 1) {
            currentDims.add(0);
            for (int i = 0; i < count; i++) {
                currentDims.set(currentDim, i);
                int offset = ((Array) varInfo.getInfo()).getOffset(currentDims);
                String thisRegSpace = reg.allocateTemperSpace();
                BasicLlvmPrinter.printGEP("[" + ((Array) varInfo.getInfo()).getSize() +
                        " x i32]", varInfo.getRegisCode(), thisRegSpace, offset, buffer);
                BasicLlvmPrinter.printStore(thisNode.getChild(i).getContext(), thisRegSpace, buffer);
            }
            currentDims.remove(currentDim);
            return;
        }
        if (count <= 0) {
            return;
        }
        currentDims.add(0);
        for (int i = 0; i < count; i++) {
            currentDims.set(currentDim, i);
            arrayInitialWalker(thisNode.getChild(i), varInfo, dims, currentDims, reg, buffer);
        }
        currentDims.remove(currentDim);
    }

    public void addConstVar(String VarName, int varType, String constValue) {
        if (this.checkVarConflict(VarName)) {
            System.err.println("变量定义冲突！\n");
            System.exit(5);
        } else {
            Var newVar = new Var(VarName, varType, null, constValue);
            localMapStack.peek().put(VarName, newVar);
        }
    }
}
