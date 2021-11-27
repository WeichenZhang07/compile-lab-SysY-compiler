package tools;

import dataStructure.Function;
import dataStructure.Var;

import java.util.HashMap;
import java.util.Stack;

import dataStructure.nodeInStack;


public class VarsManager {
    private final Stack<HashMap<String, Var>> localMapStack = new Stack<>();

    public VarsManager() {
        HashMap<String, Var> globalMap = new HashMap<>();
        globalMap.put("getint", new Var("getint", "function", null,
                new Function("getint", "int", 0,
                        null)));
        globalMap.put("putint", new Var("putint", "function", null,
                new Function("putint", "void",
                        1, new String[]{"int"})));
        globalMap.put("putch", new Var("putch", "function", null,
                new Function("putch", "void", 1,
                        new String[]{"int"})));
        globalMap.put("getch", new Var("getch", "function", null,
                new Function("getch", "int",
                        0, null)));
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

    public String addVar(String VarName, String varType, RegisterManager reg) {
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
                BasicLlvmPrinter.align();
                System.out.println(newVar.getRegisCode() + " = " + "alloca " + "i32");
            } else {
                System.out.println("@" + VarName + " = " + "dso_local global i32 0");
                newSpace = "@" + VarName;
                newVar = new Var(VarName, varType, newSpace);
            }
            localMapStack.peek().put(VarName, newVar);
            return newSpace;
        }
    }

    public String addVar(String VarName, String varType, RegisterManager reg, nodeInStack initValue) {
        if (localMapStack.size() > 1) {
            String thisRegCode = addVar(VarName, varType, reg);
            BasicLlvmPrinter.align();
            System.out.println("store i32 " + initValue.getContext() + "," + "i32* " + thisRegCode);
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

    public void addConstVar(String VarName, String varType, String constValue) {
        if (this.checkVarConflict(VarName)) {
            System.err.println("变量定义冲突！\n");
            System.exit(5);
        } else {
            Var newVar = new Var(VarName, varType, null, constValue);
            localMapStack.peek().put(VarName, newVar);
        }
    }

}
