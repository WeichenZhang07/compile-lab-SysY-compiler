import gen.grammerBaseListener;
import gen.grammerParser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.util.HashMap;
import java.util.Stack;


public class myListener extends grammerBaseListener {

    public static final int IS_NUM = 0, IS_VAL = 1;

    public static final int IF_SINGLE = 0, IF_ELSE = 1;

    public static final int I1 = 0, I32 = 1;

    int temperCode = 1;// to allocate name for temperVar
    int localVarCode = 1;// to allocate name for declined localVar
    int currentLayer = 0;// block深度
    String top_var_del_type; // tell exitVarDef() function what the type of the var is;


    class nodeInStack {
        String context;
        int type;
        int varType;

        nodeInStack() {
            this.type = -1;
        }


        nodeInStack(String context, int type, int varType) {
            this.context = context;
            this.type = type;
            this.varType = varType;
        }

        int getType() {
            return this.type;
        }

        String getContext() {
            return this.context;
        }
    } //

    class Function {
        String name;
        String type;
        int paramNum;
        String[] paramsType;

        Function(String name, String type, int paramNum,
                 String[] paramsType) {
            this.name = name;
            this.type = type;
            this.paramNum = paramNum;
            this.paramsType = paramsType;
        }
    }

    class Var {
        String name; //变量名
        String type; //变量类型
        String constContent; //常值变量的值
        Function funcInfo; //函数变量详细信息
        int code;
        boolean isConst;

        public Var() {

        }

        public Var(String name, String type, int code) {
            this();
            this.name = name;
            this.type = type;
            this.code = code;
            this.isConst = false;
        }

        public Var(String name, String type, int code, String constContent) {
            this(name, type, code);
            this.isConst = true;
            this.constContent = constContent;
        }

        public Var(String name, String type, int code, Function funcInfo) {
            super();
            this.name = name;
            this.type = type;
            this.code = code;
            this.funcInfo = funcInfo;
        }

        public int getCode() {
            return code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    class ifInfo {
        int type;
        String ifBlockCode;
        String elseBlockCode;
        String nextBlockCode;

        public ifInfo(String ifBlockCode, String nextBlockCode) {
            type = IF_SINGLE;
            this.ifBlockCode = ifBlockCode;
            this.nextBlockCode = nextBlockCode;
        }

        public ifInfo(String ifBlockCode, String elseBlockCode, String nextBlockCode) {
            type = IF_ELSE;
            this.elseBlockCode = elseBlockCode;
            this.ifBlockCode = ifBlockCode;
            this.nextBlockCode = nextBlockCode;
        }

        public int getType() {
            return type;
        }

        public String getIfBlockCode() {
            return ifBlockCode;
        }

        public String getElseBlockCode() {
            return elseBlockCode;
        }

        public String getNextBlockCode() {
            return nextBlockCode;
        }
    }


    Stack<nodeInStack> stack = new Stack<>(); //store information to be passed to higher layer
    Stack<HashMap<String, Var>> localMapStack = new Stack<>();
    Stack<ifInfo> ifInfoStack = new Stack<>();

    Var searchTopByVarName(String name) {
        int len = localMapStack.size();
        Var result = null;
        for (int i = len - 1; i >= 0; i--) {
            HashMap<String, Var> temper = localMapStack.get(i);
            result = temper.get(name);
            if (result != null) break;
        }
        return result;
    }//在栈式符号表中寻找优先级最高的同名变量，若未找到，返回null

    void popLocalMap() {
        HashMap<String, Var> top = localMapStack.pop();
        int num = top.size();
        localVarCode -= num;
    }//删除当前作用域的符号表并归位变量序号

    void align() {
        for (int i = 0; i < currentLayer; i++) {
            System.out.print("   ");
        }
    }

    int zext(nodeInStack a, nodeInStack b) {
        if (a.varType < b.varType) {
            int thisCode = temperCode++;
            System.out.println("%t" + thisCode + " = zext i1 " + a.getContext() +
                    "to i32");
            a.varType = I32;
            a.context = "%t" + thisCode;
        } else if (a.varType > b.varType) {
            int thisCode = temperCode++;
            System.out.println("%t" + thisCode + " = zext i1 " + b.getContext() +
                    "to i32");
            b.varType = I32;
            b.context = "%t" + thisCode;
        }
        return Integer.max(a.varType, b.varType);
    }

    @Override
    public void enterCompUnit(grammerParser.CompUnitContext ctx) {
        localMapStack.push(new HashMap<>());
        HashMap<String, Var> topMap = localMapStack.peek();
        topMap.put("getint", new Var("getint", "function", -1,
                new Function("getint", "int", 0,
                        null)));
        System.out.println("declare i32 @getint()");


        topMap.put("putint", new Var("putint", "function", -1,
                new Function("putint", "void",
                        1, new String[]{"int"})));
        System.out.println("declare void @putint(i32)");


        topMap.put("putch", new Var("putch", "function", -1,
                new Function("putch", "void", 1,
                        new String[]{"int"})));
        System.out.println("declare void @putch(i32)");
        topMap.put("getch", new Var("getch", "function", -1,
                new Function("getch", "int",
                        0, null)));
        System.out.println("declare i32 @getch()");
    }

    @Override
    public void enterFuncDef(grammerParser.FuncDefContext ctx) {
        System.out.print("define dso_local ");
        String Ident = ctx.getChild(1).toString();
        String funcType = ctx.getChild(0).getChild(0).toString();
        align();
        System.out.print("i32 ");
        System.out.println("@" + Ident + " () {");
        currentLayer++;
    }

    @Override
    public void exitFuncDef(grammerParser.FuncDefContext ctx) {
        currentLayer--;
        align();
        System.out.println("}");
    }

    @Override
    public void exitDecimal(grammerParser.DecimalContext ctx) {
        TerminalNodeImpl child = (TerminalNodeImpl) ctx.getChild(0);
        String num = child.toString();
        int dec = Integer.parseInt(num);
        String tmp = Integer.toString(dec);
        nodeInStack node = new nodeInStack(tmp, IS_NUM, I32);
        stack.push(node);
    }

    @Override
    public void exitOctal(grammerParser.OctalContext ctx) {
        TerminalNodeImpl child = (TerminalNodeImpl) ctx.getChild(0);
        String num = child.toString();
        num = num.substring(1).equals("") ? "0" : num.substring(1);
        int dec = Integer.parseInt(num, 8);
        String tmp = Integer.toString(dec);
        nodeInStack node = new nodeInStack(tmp, IS_NUM, I32);
        stack.push(node);
    }

    @Override
    public void exitHex(grammerParser.HexContext ctx) {
        TerminalNodeImpl child = (TerminalNodeImpl) ctx.getChild(0);
        String num = child.toString();
        num = num.substring(2);
        int dec = Integer.parseInt(num, 16);
        String tmp = Integer.toString(dec);
        nodeInStack node = new nodeInStack(tmp, IS_NUM, I32);
        stack.push(node);
    }

    @Override
    public void exitAssignment(grammerParser.AssignmentContext ctx) {
        ParseTree x = ctx.getChild(0);
        nodeInStack right = stack.pop();
        nodeInStack left = stack.pop();
        if (left.type == IS_NUM) System.exit(7);
        align();
        System.out.println("store i32 " + right.getContext() + ", i32* " + left.getContext());

    }

    @Override
    public void exitReturn(grammerParser.ReturnContext ctx) {
        nodeInStack right = stack.pop();
        align();
        System.out.println("ret i32 " + right.getContext());
    }

    @Override
    public void exitIfState(grammerParser.IfStateContext ctx) {
        nodeInStack right = stack.pop();
        if (ctx.getParent().getChildCount() > 2) {
            int ifBlockCode = temperCode++;
            int elseBlockCode = temperCode++;
            int nextBlockCode = temperCode++;
            ifInfo thisIfInfo = new ifInfo("%t" + ifBlockCode,
                    "%t" + elseBlockCode, "%t" + nextBlockCode);
            ifInfoStack.push(thisIfInfo);
            align();
            System.out.println("br i1 " + right.getContext() + ", label %t" +
                    ifBlockCode + ", label %t" + elseBlockCode);
        } else {
            int ifBlockCode = temperCode++;
            int nextBlockCode = temperCode++;
            ifInfo thisIfInfo = new ifInfo("%t" + ifBlockCode,
                    "%t" + nextBlockCode);
            ifInfoStack.push(thisIfInfo);
            align();
            System.out.println("br i1 " + right.getContext() + ", label %t" +
                    ifBlockCode + ", label %t" + nextBlockCode);
        }
    }

    @Override
    public void enterIfBlock(grammerParser.IfBlockContext ctx) {
        ifInfo thisInfo = ifInfoStack.peek();
        System.out.println(thisInfo.getIfBlockCode().substring(1) + ":");
        localMapStack.push(new HashMap<>());
    }

    @Override
    public void exitIfBlock(grammerParser.IfBlockContext ctx) {
        ifInfo thisInfo = ifInfoStack.peek();
        popLocalMap();
        align();
        System.out.println("br label " + thisInfo.nextBlockCode);
    }

    @Override
    public void exitCond(grammerParser.CondContext ctx) {
        nodeInStack right = stack.pop();
        if (right.varType != I1) {
            int thisCode = temperCode++;
            align();
            System.out.println("%t" + thisCode + " = trunc i32 " + right.getContext() + " to i1");
            right.varType = I1;
            right.context = "%t" + thisCode;
        }
        stack.push(right);
    }

    @Override
    public void enterElseBlock(grammerParser.ElseBlockContext ctx) {
        ifInfo thisInfo = ifInfoStack.peek();
        System.out.println(thisInfo.getElseBlockCode().substring(1) + ":");
        localMapStack.push(new HashMap<>());
    }

    @Override
    public void exitElseBlock(grammerParser.ElseBlockContext ctx) {
        popLocalMap();
        ifInfo thisInfo = ifInfoStack.peek();
        align();
        System.out.println("br label " + thisInfo.nextBlockCode);
    }

    @Override
    public void enterIf(grammerParser.IfContext ctx) {
        int num = ctx.getChildCount();
    }

    @Override
    public void exitIf(grammerParser.IfContext ctx) {
        ifInfo thisInfo = ifInfoStack.pop();
        System.out.println(thisInfo.getNextBlockCode().substring(1) + ":");
    }

    @Override
    public void exitLval(grammerParser.LvalContext ctx) {
        ParseTree tmp = ctx.getChild(0);
        String name = tmp.toString();
        Var thisVar = searchTopByVarName(name);
        if (thisVar == null) {
            System.err.println("遇到未定义变量名！");
            System.exit(10);
        }
        int code = thisVar.getCode();
        nodeInStack thisNode;
        if (thisVar.isConst) {
            thisNode = new nodeInStack(thisVar.constContent, IS_NUM, I32);
        } else thisNode = new nodeInStack("%l" + code, IS_VAL, I32);
        stack.push(thisNode);
    }

    @Override
    public void exitExp(grammerParser.ExpContext ctx) {
        nodeInStack right = stack.pop();
        stack.push(right);// push exp to the stack
    }

    @Override
    public void exitInitVal(grammerParser.InitValContext ctx) {
        nodeInStack right = stack.pop();
        stack.push(right);// push exp to the stack
    }

    @Override
    public void exitMultipleMulExp(grammerParser.MultipleMulExpContext ctx) {
        nodeInStack right = stack.pop();
        nodeInStack left = stack.pop();
        int thisVarType = zext(left, right);
        if (right.getType() == IS_NUM && left.getType() == IS_NUM) {
            int leftNum = Integer.parseInt(left.getContext());
            int rightNum = Integer.parseInt(right.getContext());
            int thisValue = Integer.MIN_VALUE;
            String symbol = ctx.getChild(1).toString();
            switch (symbol) {
                case "*" -> thisValue = leftNum * rightNum;
                case "/" -> thisValue = leftNum / rightNum;
                case "%" -> thisValue = leftNum % rightNum;
                default -> System.exit(3);
            }
            stack.push(new nodeInStack(Integer.toString(thisValue), IS_NUM, thisVarType));
        } else {
            String symbol = ctx.getChild(1).toString();
            int newCode = temperCode++;
            String tmp = "%t" + newCode + " = ";
            switch (symbol) {
                case "*" -> tmp += "mul nsw ";
                case "/" -> tmp += "sdiv ";
                case "%" -> tmp += "srem ";
                default -> System.exit(3);
            }
            tmp += "i32 ";
            tmp += left.getContext() + ",";
            tmp += right.getContext();
            align();
            System.out.println(tmp);
            nodeInStack thisNode = new nodeInStack("%t" + newCode, IS_VAL,
                    thisVarType);
            stack.push(thisNode);
        }
    }

    @Override
    public void exitMultipleAddExp(grammerParser.MultipleAddExpContext ctx) {
        int thisValue;
        nodeInStack right = stack.pop();
        nodeInStack left = stack.pop();
        int thisVarType = zext(left, right);
        if (right.getType() == IS_NUM && left.getType() == IS_NUM) {
            String symbol = ctx.getChild(1).toString();
            int rightNum = Integer.parseInt(right.getContext());
            int leftNum = Integer.parseInt(left.getContext());
            switch (symbol) {
                case "+" -> thisValue = leftNum + rightNum;
                case "-" -> thisValue = leftNum - rightNum;
                default -> thisValue = 0;
            }
            nodeInStack thisNode = new nodeInStack(Integer.toString(thisValue), IS_NUM, thisVarType);
            stack.push(thisNode);
        } else {
            String symbol = ctx.getChild(1).toString();
            int newCode = temperCode++;
            String tmp = "%t" + newCode + " = ";
            switch (symbol) {
                case "+" -> tmp += "add ";
                case "-" -> tmp += "sub ";
                default -> System.exit(3);
            }
            tmp += "i32 ";
            tmp += (left.getContext() + ", " + right.getContext());
            nodeInStack thisNode = new nodeInStack("%t" + newCode, IS_VAL, thisVarType);
            align();
            System.out.println(tmp);
            stack.push(thisNode);
        }
    }

    @Override
    public void exitMultipleRelExp(grammerParser.MultipleRelExpContext ctx) {
        String cd = "";
        String character;
        character = ctx.getChild(1).toString();
        switch (character) {
            case ("<") -> {
                cd = "slt";
            }
            case (">") -> {
                cd = "sgt";
            }
            case ("<=") -> {
                cd = "sle";
            }
            case (">=") -> {
                cd = "sge";
            }
            case ("==") -> {
                cd = "eq";
            }
            default -> {
            }
        }
        nodeInStack right = stack.pop(), left = stack.pop();
        int thisVarType = zext(left, right);
        if (right.type == IS_NUM && left.type == IS_NUM) {
            boolean r;
            switch (character) {
                case (">") -> {
                    r = Integer.parseInt(left.getContext()) >
                            Integer.parseInt(right.getContext());
                }
                case (">=") -> {
                    r = Integer.parseInt(left.getContext()) >=
                            Integer.parseInt(right.getContext());
                }
                case ("<=") -> {
                    r = Integer.parseInt(left.getContext()) <=
                            Integer.parseInt(right.getContext());
                }
                case ("<") -> {
                    r = Integer.parseInt(left.getContext()) <
                            Integer.parseInt(right.getContext());
                }
                case ("==") -> {
                    r = Integer.parseInt(left.getContext()) ==
                            Integer.parseInt(right.getContext());
                }
                default -> {
                    r = false;
                    System.exit(-1);
                }
            }
            int thisCode = temperCode++;
            nodeInStack thisNode = new nodeInStack(r ? "1" : "0", IS_NUM, I1);
            stack.push(thisNode);
        } //若能够在编译过程中得出条件运算结果
        else {
            int thisCode = temperCode++;
            nodeInStack thisNode = new nodeInStack("%t" + thisCode, IS_VAL, I1);
            String thisCmdLine = thisNode.getContext() + " = icmp " + cd +
                    " i32 " + left.getContext() + ", " + right.getContext();
            align();
            System.out.println(thisCmdLine);
            stack.push(thisNode);
        }
    }

    @Override
    public void exitMultipleEqExp(grammerParser.MultipleEqExpContext ctx) {
        String opC = ctx.getChild(1).toString();
        nodeInStack right = stack.pop();
        nodeInStack left = stack.pop();
        int thisVarType = zext(left, right);
        nodeInStack thisNode;
        String operation = opC.equals("==") ? "eq" : "ne";

        if (right.getType() == IS_NUM && left.getType() == IS_NUM) {
            int result = right.getContext().equals(left.getContext()) ? 1 : 0;
            thisNode = new nodeInStack(Integer.toString(result), IS_NUM, thisVarType);
        } else {
            int thisCode = temperCode++;
            align();
            System.out.println("%t" + thisCode + " = icmp " + operation + " i32 " + left.getContext() + ", " +
                    right.getContext());
            thisNode = new nodeInStack("%t" + thisCode, IS_VAL, I1);
        }
        stack.push(thisNode);
    }

    @Override
    public void exitMultipleLAndExp(grammerParser.MultipleLAndExpContext ctx) {
        nodeInStack right = stack.pop();
        nodeInStack left = stack.pop();
        int thisVarType = zext(left, right);
        nodeInStack thisNode;

        if (right.getType() != IS_VAL && left.getType() != IS_VAL) {
            int result = Integer.parseInt(right.getContext()) != 0
                    && Integer.parseInt(left.getContext()) != 1 ? 1 : 0;
            thisNode = new nodeInStack(Integer.toString(result), IS_NUM, I1);
        } else {
            int thisCode = temperCode++;
            align();
            System.out.println("%t" + thisCode + " = and " + " i1 " + left.getContext() + ", " +
                    right.getContext());
            thisNode = new nodeInStack("%t" + thisCode, IS_VAL, I1);
        }
        stack.push(thisNode);
    }

    @Override
    public void exitMultipleLOrExp(grammerParser.MultipleLOrExpContext ctx) {
        nodeInStack right = stack.pop();
        nodeInStack left = stack.pop();
        int thisVarType = zext(left, right);
        nodeInStack thisNode;

        if (right.getType() != IS_VAL && left.getType() != IS_VAL) {
            int result = Integer.parseInt(right.getContext()) != 0
                    || Integer.parseInt(left.getContext()) != 0 ? 1 : 0;
            thisNode = new nodeInStack(Integer.toString(result), IS_NUM, I1);
        } else {
            int thisCode = temperCode++;
            align();
            System.out.println("%t" + thisCode + " = or " + " i1 " + left.getContext() + ", " +
                    right.getContext());
            thisNode = new nodeInStack("%t" + thisCode, IS_VAL, I1);
        }
        stack.push(thisNode);
    }

    @Override
    public void exitPrimaryExp(grammerParser.PrimaryExpContext ctx) {
        if (ctx.getChild(0) instanceof grammerParser.LvalContext) {
            nodeInStack right = stack.pop();
            if (right.type == IS_VAL) {

                int newCode = temperCode++;
                nodeInStack thisNode = new nodeInStack("%t" + newCode, IS_VAL, I32);
                align();
                System.out.println(thisNode.getContext() + " = load i32, i32* " + right.getContext());
                stack.push(thisNode);
            } else stack.push(right);
        }
    }

    @Override
    public void enterVarDecl(grammerParser.VarDeclContext ctx) {
        top_var_del_type = ctx.getChild(0).toString();
    }

    @Override
    public void exitFunc(grammerParser.FuncContext ctx) {
        int paramNum;
        String funcName = ctx.getChild(0).toString();
        if (searchTopByVarName(funcName) == null ||
                !searchTopByVarName(funcName).type.equals("function"))//处理未定义函数
            System.exit(8);
        Function thisFunc = searchTopByVarName(funcName).funcInfo;
        String t = "call ";
        switch (thisFunc.type) {
            case ("void") -> {
                t += "void ";
            }
            case ("int") -> {
                t += "i32 ";
            }
        }
        t += "@" + funcName + " (";
        paramNum = ctx.getChildCount() < 4 ? 0 :
                ((ctx.getChild(2).getChildCount() - 1) / 2 + 1);
        if (thisFunc.paramNum != paramNum) System.exit(9);
        Stack<nodeInStack> reversor = new Stack<>();
        for (int i = 0; i < paramNum; i++) {
            reversor.push(stack.pop());
        }
        for (int i = 0; i < paramNum; i++) {
            t += ("i32 " + reversor.pop().context);
            if (i < paramNum - 1) {
                t += ",";
            }
        }
        t += ")";
        if (thisFunc.type.equals("int")) {
            int thisCode = temperCode++;
            t = "%t" + thisCode + " = " + t;
            nodeInStack thisNode = new nodeInStack("%t" + thisCode, IS_NUM, I32);
            stack.push(thisNode);

        } else {
            nodeInStack thisNode = new nodeInStack("", IS_VAL, -1);
            stack.push(thisNode);
        }
        align();
        System.out.println(t);
    }

    @Override
    public void exitUnary(grammerParser.UnaryContext ctx) {
        nodeInStack right = stack.pop();
        nodeInStack unaryExp;
        if (right.getType() != IS_VAL) {
            int thisValue = Integer.parseInt(right.getContext());
            if (ctx.getChildCount() == 2) {
                String symbol = ctx.getChild(0).getChild(0).toString();
                if (symbol.equals("-")) {
                    unaryExp = new nodeInStack(Integer.toString(-thisValue),
                            IS_NUM, right.varType);
                } else if (symbol.equals("!")) {
                    unaryExp = new nodeInStack(Integer.toString(thisValue == 0 ? 1 : 0),
                            IS_NUM, I1);
                } else {
                    unaryExp = new nodeInStack(Integer.toString(thisValue),
                            IS_NUM, right.varType);
                }
                stack.push(unaryExp);
            }


        } else {
            String tmp = "";
            int newCode;
            nodeInStack thisNode = right;
            if (ctx.getChildCount() == 2) {
                String symbol = ctx.getChild(0).getChild(0).toString();
                if (symbol.equals("-")) {
                    if (right.varType != I32) {
                        int thisCode = temperCode++;
                        align();
                        System.out.println("%t" + thisCode + " = zext i1 " + right.getContext() + " to i32");
                        right.varType = I32;
                        right.context = "%t" + thisCode;
                    }
                    newCode = temperCode++;
                    tmp += ("%t" + newCode + " = " + "sub " + "i32 0, " + right.getContext());
                    align();
                    System.out.println(tmp);
                    thisNode = new nodeInStack("%t" + newCode, IS_VAL, right.varType);
                } else if (symbol.equals("!")) {
                    newCode = temperCode++;
                    tmp += ("%t" + newCode + " = " + "icmp eq " + (right.varType == I32 ? "i32 " : "i1 ") +
                            right.getContext() + ", " +
                            "0");
                    align();
                    System.out.println(tmp);
                    thisNode = new nodeInStack("%t" + newCode, IS_VAL, I1);
                }
            }
            stack.push(thisNode);
        }
    }

    @Override
    public void exitSingle(grammerParser.SingleContext ctx) {
        String newName = ctx.getChild(0).toString();
        if (localMapStack.peek().get(newName) != null) {
            System.err.println("局部变量定义冲突！\n" + ctx);
            System.exit(5);
        }
        int thisVarCode = localVarCode++;
        Var newVar = new Var(newName, top_var_del_type, thisVarCode);
        localMapStack.peek().put(newName, newVar);
        align();
        System.out.println("%l" + thisVarCode + " = " + "alloca " + "i32");
    }

    @Override
    public void exitInitial(grammerParser.InitialContext ctx) {
        String newName = ctx.getChild(0).toString();
        if (localMapStack.peek().get(newName) != null) {
            System.err.println("局部变量定义冲突！\n" + ctx);
            System.exit(5);
        }
        int thisVarCode = localVarCode++;
        Var newVar = new Var(newName, top_var_del_type, thisVarCode);
        localMapStack.peek().put(newName, newVar);
        align();
        System.out.println("%l" + thisVarCode + " = " + "alloca " + "i32");
        nodeInStack right = stack.pop();// store the corresponding info of exp
        align();
        System.out.println("store i32 " + right.getContext() + "," + "i32* %l" + thisVarCode);
    }

    @Override
    public void enterConstDecl(grammerParser.ConstDeclContext ctx) {
        top_var_del_type = ctx.getChild(1).toString();
    }

    @Override
    public void exitConstDef(grammerParser.ConstDefContext ctx) {
        nodeInStack right = stack.pop();
        if (right.type != IS_NUM) System.exit(6);
        String name = ctx.getChild(0).toString();
        int thisCode = localVarCode++;
        Var newVar = new Var(name, top_var_del_type, thisCode, right.context);
        if (localMapStack.peek().get(name) != null) System.exit(5);
        localMapStack.peek().put(name, newVar);
        nodeInStack thisNode = new nodeInStack(right.getContext(), IS_NUM, I32);
        stack.push(thisNode);
    }

    @Override
    public void exitFuncRParams(grammerParser.FuncRParamsContext ctx) {
    }
}
