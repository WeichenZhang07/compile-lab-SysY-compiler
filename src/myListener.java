import gen.grammerBaseListener;
import gen.grammerParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import dataStructure.Function;
import dataStructure.nodeInStack;
import dataStructure.Var;
import dataStructure.IfInfo;
import tools.BasicLlvmPrinter;
import tools.RegisterManager;
import tools.VarsManager;

import java.util.HashMap;
import java.util.Stack;


public class myListener extends grammerBaseListener {

    public static final int IS_NUM = 0, IS_VAL = 1;

    public static final int I1 = 0, I32 = 1;

    RegisterManager registerManager = new RegisterManager();
    VarsManager varsManager = new VarsManager();

    int temperCode = 1;// to allocate name for temperVar
    int localVarCode = 1;// to allocate name for declined localVar
    int currentLayer = 0;// block深度
    String top_var_del_type; // tell exitVarDef() function what the type of the var is;


    Stack<nodeInStack> stack = new Stack<>(); //store information to be passed to higher layer
    Stack<IfInfo> IfInfoStack = new Stack<>();


    int zext(nodeInStack a, nodeInStack b) {
        if (a.getVarType() < b.getVarType()) {
            int thisCode = temperCode++;
            System.out.println("%t" + thisCode + " = zext i1 " + a.getContext() +
                    "to i32");
            a.setVarType(I32);
            a.setContext("%t" + thisCode);
        } else if (a.getVarType() > b.getVarType()) {
            int thisCode = temperCode++;
            System.out.println("%t" + thisCode + " = zext i1 " + b.getContext() +
                    "to i32");
            b.setVarType(I32);
            b.setContext("%t" + thisCode);
        }
        return Integer.max(a.getVarType(), b.getVarType());
    }


    @Override
    public void enterFuncDef(grammerParser.FuncDefContext ctx) {
        System.out.print("define dso_local ");
        String Ident = ctx.getChild(1).toString();
        String funcType = ctx.getChild(0).getChild(0).toString();
        BasicLlvmPrinter.align();
        System.out.print("i32 ");
        System.out.println("@" + Ident + " () {");
        currentLayer++;
    }

    @Override
    public void exitFuncDef(grammerParser.FuncDefContext ctx) {
        currentLayer--;
        BasicLlvmPrinter.align();
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
        if (left.getType() == IS_NUM) System.exit(7);
        BasicLlvmPrinter.align();
        System.out.println("store i32 " + right.getContext() + ", i32* " + left.getContext());

    }

    @Override
    public void exitReturn(grammerParser.ReturnContext ctx) {
        nodeInStack right = stack.pop();
        BasicLlvmPrinter.align();
        System.out.println("ret i32 " + right.getContext());
    }

    @Override
    public void exitIfState(grammerParser.IfStateContext ctx) {
        nodeInStack right = stack.pop();
        if (ctx.getParent().getChildCount() > 2) {
            int ifBlockCode = temperCode++;
            int elseBlockCode = temperCode++;
            int nextBlockCode = temperCode++;
            IfInfo thisIfInfo = new IfInfo("%t" + ifBlockCode,
                    "%t" + elseBlockCode, "%t" + nextBlockCode);
            IfInfoStack.push(thisIfInfo);
            BasicLlvmPrinter.align();
            System.out.println("br i1 " + right.getContext() + ", label %t" +
                    ifBlockCode + ", label %t" + elseBlockCode);
        } else {
            int ifBlockCode = temperCode++;
            int nextBlockCode = temperCode++;
            IfInfo thisIfInfo = new IfInfo("%t" + ifBlockCode,
                    "%t" + nextBlockCode);
            IfInfoStack.push(thisIfInfo);
            BasicLlvmPrinter.align();
            System.out.println("br i1 " + right.getContext() + ", label %t" +
                    ifBlockCode + ", label %t" + nextBlockCode);
        }
    }

    @Override
    public void enterIfBlock(grammerParser.IfBlockContext ctx) {
        IfInfo thisInfo = IfInfoStack.peek();
        System.out.println(thisInfo.getIfBlockCode().substring(1) + ":");
    }

    @Override
    public void enterBlock(grammerParser.BlockContext ctx) {
        varsManager.enterBlock();
    }

    @Override
    public void exitBlock(grammerParser.BlockContext ctx) {
        varsManager.exitBlock();
    }

    @Override
    public void exitIfBlock(grammerParser.IfBlockContext ctx) {
        IfInfo thisInfo = IfInfoStack.peek();
        BasicLlvmPrinter.align();
        System.out.println("br label " + thisInfo.getNextBlockCode());
    }

    @Override
    public void exitCond(grammerParser.CondContext ctx) {
        nodeInStack right = stack.pop();
        if (right.getVarType() != I1) {
            int thisCode = temperCode++;
            BasicLlvmPrinter.align();
            System.out.println("%t" + thisCode + " = trunc i32 " + right.getContext() + " to i1");
            right.setVarType(I1);
            right.setContext("%t" + thisCode);
        }
        stack.push(right);
    }

    @Override
    public void enterElseBlock(grammerParser.ElseBlockContext ctx) {
        IfInfo thisInfo = IfInfoStack.peek();
        System.out.println(thisInfo.getElseBlockCode().substring(1) + ":");
    }

    @Override
    public void exitElseBlock(grammerParser.ElseBlockContext ctx) {
        IfInfo thisInfo = IfInfoStack.peek();
        BasicLlvmPrinter.align();
        System.out.println("br label " + thisInfo.getNextBlockCode());
    }


    @Override
    public void exitIf(grammerParser.IfContext ctx) {
        IfInfo thisInfo = IfInfoStack.pop();
        System.out.println(thisInfo.getNextBlockCode().substring(1) + ":");
    }

    @Override
    public void exitLval(grammerParser.LvalContext ctx) {
        ParseTree tmp = ctx.getChild(0);
        String name = tmp.toString();
        Var thisVar = varsManager.consultVar(name);
        if (thisVar == null) {
            System.err.println("遇到未定义变量名！");
            System.exit(10);
        }
        String code = thisVar.getRegisCode();
        nodeInStack thisNode;
        if (thisVar.isConst()) {
            thisNode = new nodeInStack(thisVar.getConstContent(), IS_NUM, I32);
        } else thisNode = new nodeInStack(code, IS_VAL, I32);
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
            BasicLlvmPrinter.align();
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
            BasicLlvmPrinter.align();
            System.out.println(tmp);
            stack.push(thisNode);
        }
    }

    @Override
    public void exitMultipleRelExp(grammerParser.MultipleRelExpContext ctx) {
        String character;
        character = ctx.getChild(1).toString();

        nodeInStack right = stack.pop(), left = stack.pop();
        int thisVarType = zext(left, right);
        if (right.getType() == IS_NUM && left.getType() == IS_NUM) {
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
            BasicLlvmPrinter.printIcmp(left.getContext(), right.getContext(), "%t" + thisCode, character);
            BasicLlvmPrinter.align();
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
            BasicLlvmPrinter.align();
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
            BasicLlvmPrinter.align();
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
            BasicLlvmPrinter.align();
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
            if (right.getType() == IS_VAL) {

                int newCode = temperCode++;
                nodeInStack thisNode = new nodeInStack("%t" + newCode, IS_VAL, I32);
                BasicLlvmPrinter.align();
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
        if (varsManager.consultVar(funcName) == null ||
                !varsManager.consultVar(funcName).getType().equals("function"))//处理未定义函数
            System.exit(8);
        Function thisFunc = varsManager.consultVar(funcName).getFuncInfo();
        StringBuilder t = new StringBuilder("call ");
        switch (thisFunc.getType()) {
            case ("void") -> {
                t.append("void ");
            }
            case ("int") -> {
                t.append("i32 ");
            }
        }
        t.append("@").append(funcName).append(" (");
        paramNum = ctx.getChildCount() < 4 ? 0 :
                ((ctx.getChild(2).getChildCount() - 1) / 2 + 1);
        if (thisFunc.getParamNum() != paramNum) System.exit(9);
        Stack<nodeInStack> reversor = new Stack<>();
        for (int i = 0; i < paramNum; i++) {
            reversor.push(stack.pop());
        }
        for (int i = 0; i < paramNum; i++) {
            t.append("i32 ").append(reversor.pop().getContext());
            if (i < paramNum - 1) {
                t.append(",");
            }
        }
        t.append(")");
        if (thisFunc.getType().equals("int")) {
            int thisCode = temperCode++;
            t.insert(0, "%t" + thisCode + " = ");
            nodeInStack thisNode = new nodeInStack("%t" + thisCode, IS_NUM, I32);
            stack.push(thisNode);

        } else {
            nodeInStack thisNode = new nodeInStack("", IS_VAL, -1);
            stack.push(thisNode);
        }
        BasicLlvmPrinter.align();
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
                            IS_NUM, right.getVarType());
                } else if (symbol.equals("!")) {
                    unaryExp = new nodeInStack(Integer.toString(thisValue == 0 ? 1 : 0),
                            IS_NUM, I1);
                } else {
                    unaryExp = new nodeInStack(Integer.toString(thisValue),
                            IS_NUM, right.getVarType());
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
                    if (right.getVarType() != I32) {
                        int thisCode = temperCode++;
                        BasicLlvmPrinter.align();
                        System.out.println("%t" + thisCode + " = zext i1 " + right.getContext() + " to i32");
                        right.setVarType(I32);
                        right.setContext("%t" + thisCode);
                    }
                    newCode = temperCode++;
                    tmp += ("%t" + newCode + " = " + "sub " + "i32 0, " + right.getContext());
                    BasicLlvmPrinter.align();
                    System.out.println(tmp);
                    thisNode = new nodeInStack("%t" + newCode, IS_VAL, right.getVarType());
                } else if (symbol.equals("!")) {
                    newCode = temperCode++;
                    tmp += ("%t" + newCode + " = " + "icmp eq " + (right.getVarType() == I32 ? "i32 " : "i1 ") +
                            right.getContext() + ", " +
                            "0");
                    BasicLlvmPrinter.align();
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
        varsManager.addVar(newName, top_var_del_type, registerManager);
    }

    @Override
    public void exitInitial(grammerParser.InitialContext ctx) {
        String newName = ctx.getChild(0).toString();
        nodeInStack right = stack.pop();
        varsManager.addVar(newName, top_var_del_type, registerManager, right.getContext());
    }

    @Override
    public void enterConstDecl(grammerParser.ConstDeclContext ctx) {
        top_var_del_type = ctx.getChild(1).toString();
    }

    @Override
    public void exitConstDef(grammerParser.ConstDefContext ctx) {
        nodeInStack right = stack.pop();
        if (right.getType() != IS_NUM) System.exit(6);
        String name = ctx.getChild(0).toString();
        varsManager.addConstVar(name, top_var_del_type, right.getContext());
        nodeInStack thisNode = new nodeInStack(right.getContext(), IS_NUM, I32);
        stack.push(thisNode);
    }

    @Override
    public void exitFuncRParams(grammerParser.FuncRParamsContext ctx) {
    }
}
