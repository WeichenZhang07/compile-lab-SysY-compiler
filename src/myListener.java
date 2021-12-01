import dataStructure.*;
import dataStructure.VarType.Function;
import dataStructure.block.IfInfo;
import dataStructure.block.WhileBlockInfo;
import gen.grammerParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import gen.grammerBaseListener;
import tools.*;

import java.util.ArrayList;
import java.util.Stack;


public class myListener extends grammerBaseListener {


    RegisterManager registerManager = new RegisterManager();
    VarsManager varsManager = new VarsManager();
    BlockManager blockManager = new BlockManager();
    llvmCmdBuffer cmdBuffer = new llvmCmdBuffer();

    int currentLayer = 0;// block深度
    String top_var_del_type; // tell exitVarDef() function what the type of the var is;


    Stack<nodeInStack> stack = new Stack<>(); //store information to be passed to higher layer


    @Override
    public void enterFuncDef(grammerParser.FuncDefContext ctx) {
        System.out.print("define dso_local ");
        String Ident = ctx.getChild(1).toString();
        String funcType = ctx.getChild(0).getChild(0).toString();
        System.out.print("i32 ");
        System.out.println("@" + Ident + " () {");
        currentLayer++;
    }

    @Override
    public void exitFuncDef(grammerParser.FuncDefContext ctx) {
        currentLayer--;
        cmdBuffer.putsAllocate();
        cmdBuffer.putsOperate();
        System.out.println("}");
    }

    @Override
    public void exitDecimal(grammerParser.DecimalContext ctx) {
        TerminalNodeImpl child = (TerminalNodeImpl) ctx.getChild(0);
        String num = child.toString();
        int dec = Integer.parseInt(num);
        String tmp = Integer.toString(dec);
        nodeInStack node = new nodeInStack(tmp, dataStructure.basicFinal.IS_NUM, dataStructure.basicFinal.I32, true);
        stack.push(node);
    }

    @Override
    public void exitOctal(grammerParser.OctalContext ctx) {
        TerminalNodeImpl child = (TerminalNodeImpl) ctx.getChild(0);
        String num = child.toString();
        num = num.substring(1).equals("") ? "0" : num.substring(1);
        int dec = Integer.parseInt(num, 8);
        String tmp = Integer.toString(dec);
        nodeInStack node = new nodeInStack(tmp, dataStructure.basicFinal.IS_NUM, dataStructure.basicFinal.I32, true);
        stack.push(node);
    }

    @Override
    public void exitHex(grammerParser.HexContext ctx) {
        TerminalNodeImpl child = (TerminalNodeImpl) ctx.getChild(0);
        String num = child.toString();
        num = num.substring(2);
        int dec = Integer.parseInt(num, 16);
        String tmp = Integer.toString(dec);
        nodeInStack node = new nodeInStack(tmp, dataStructure.basicFinal.IS_NUM, dataStructure.basicFinal.I32, true);
        stack.push(node);
    }

    @Override
    public void exitAssignment(grammerParser.AssignmentContext ctx) {
        ParseTree x = ctx.getChild(0);
        nodeInStack right = stack.pop();
        nodeInStack left = stack.pop();
        if (left.getType() == dataStructure.basicFinal.IS_NUM) System.exit(7);
        cmdBuffer.addToOperateBuffer("store i32 " + right.getContext() + ", i32* " + left.getContext());

    }

    @Override
    public void exitReturn(grammerParser.ReturnContext ctx) {
        nodeInStack right = stack.pop();
        cmdBuffer.addToOperateBuffer("ret i32 " + right.getContext());
    }

    @Override
    public void exitIfState(grammerParser.IfStateContext ctx) {
        nodeInStack right = stack.pop();
        if (ctx.getParent().getChildCount() > 2) {
            blockManager.enterIfElseBlock(registerManager);
            IfInfo thisBlock = blockManager.getCurrentIfInfo();
            BasicLlvmPrinter.printBr(right.getContext(), thisBlock.getIfBlockCode(), thisBlock.getElseBlockCode(), cmdBuffer);
        } else {
            blockManager.enterIfSingleBlock(registerManager);
            IfInfo thisBlockInfo = blockManager.getCurrentIfInfo();
            BasicLlvmPrinter.printBr(right.getContext(), thisBlockInfo.getIfBlockCode(),
                    thisBlockInfo.getNextBlockCode(), cmdBuffer);
        }
    }

    @Override
    public void enterIfBlock(grammerParser.IfBlockContext ctx) {
        IfInfo thisInfo = blockManager.getCurrentIfInfo();
        cmdBuffer.addToOperateBuffer(thisInfo.getIfBlockCode().substring(1) + ":");
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
        IfInfo thisInfo = blockManager.getCurrentIfInfo();
        BasicLlvmPrinter.printBr(thisInfo.getNextBlockCode(), cmdBuffer);
    }

    @Override
    public void exitCond(grammerParser.CondContext ctx) {
        nodeInStack right = stack.pop();
        if (right.getVarType() != dataStructure.basicFinal.I1) {
            String thisCode = registerManager.allocateTemperSpace();
            cmdBuffer.addToOperateBuffer(thisCode + " = trunc i32 " + right.getContext() + " to i1");
            right.setVarType(dataStructure.basicFinal.I1);
            right.setContext(thisCode);
        }
        stack.push(right);
    }

    @Override
    public void enterElseBlock(grammerParser.ElseBlockContext ctx) {
        IfInfo thisInfo = blockManager.getCurrentIfInfo();
        cmdBuffer.addToOperateBuffer(thisInfo.getElseBlockCode().substring(1) + ":");
    }

    @Override
    public void exitElseBlock(grammerParser.ElseBlockContext ctx) {
        IfInfo thisInfo = blockManager.getCurrentIfInfo();
        BasicLlvmPrinter.printBr(thisInfo.getNextBlockCode(), cmdBuffer);
    }

    @Override
    public void exitIf(grammerParser.IfContext ctx) {
        IfInfo thisInfo = (IfInfo) blockManager.exitCurrentBlock();
        cmdBuffer.addToOperateBuffer(thisInfo.getNextBlockCode().substring(1) + ":");
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
            thisNode = new nodeInStack(thisVar.getConstContent(), dataStructure.basicFinal.IS_NUM,
                    dataStructure.basicFinal.I32, true);
        } else thisNode = new nodeInStack(code, dataStructure.basicFinal.IS_VAL, dataStructure.basicFinal.I32,
                false);
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
        String operator = ctx.getChild(1).toString();
        BinaryExp(operator);
    }

    @Override
    public void exitMultipleAddExp(grammerParser.MultipleAddExpContext ctx) {
        String operator = ctx.getChild(1).toString();
        BinaryExp(operator);

    }

    private void BinaryExp(String operator) {
        nodeInStack right = stack.pop();
        nodeInStack left = stack.pop();
        int thisVarType = BasicLlvmPrinter.zext(left, right, registerManager, cmdBuffer);
        nodeInStack thisNode = Calculator.BinaryOperation(left, right, operator, registerManager, cmdBuffer);
        stack.push(thisNode);
    }

    @Override
    public void exitMultipleRelExp(grammerParser.MultipleRelExpContext ctx) {
        String character;
        character = ctx.getChild(1).toString();
        nodeInStack right = stack.pop(), left = stack.pop();
        stack.push(Calculator.compare(left, right, character, registerManager, cmdBuffer));

    }

    @Override
    public void exitMultipleEqExp(grammerParser.MultipleEqExpContext ctx) {
        String opC = ctx.getChild(1).toString();
        nodeInStack right = stack.pop();
        nodeInStack left = stack.pop();
        nodeInStack thisNode;
        thisNode = Calculator.BinaryOperation(left, right, opC, registerManager, cmdBuffer);
        stack.push(thisNode);
    }

    @Override
    public void exitMultipleLAndExp(grammerParser.MultipleLAndExpContext ctx) {
        nodeInStack right = stack.pop();
        nodeInStack left = stack.pop();
        String operator = "&&";
        stack.push(Calculator.logicalOperation(left, right, operator, registerManager, cmdBuffer));
    }

    @Override
    public void exitMultipleLOrExp(grammerParser.MultipleLOrExpContext ctx) {
        nodeInStack right = stack.pop();
        nodeInStack left = stack.pop();
        String operator = "||";
        stack.push(Calculator.logicalOperation(left, right, operator, registerManager, cmdBuffer));
    }

    @Override
    public void exitPrimaryExp(grammerParser.PrimaryExpContext ctx) {
        if (ctx.getChild(0) instanceof grammerParser.LvalContext) {
            nodeInStack right = stack.pop();
            if (right.getType() == basicFinal.IS_VAL) {
                String thisCode = registerManager.allocateTemperSpace();
                nodeInStack thisNode = new nodeInStack(thisCode, basicFinal.IS_VAL, basicFinal.I32, right.isConst());
                cmdBuffer.addToOperateBuffer(thisNode.getContext() + " = load i32, i32* " + right.getContext());
                stack.push(thisNode);
            } else stack.push(right);
        }
    }

    @Override
    public void enterVarDecl(grammerParser.VarDeclContext ctx) {
        top_var_del_type = ctx.getChild(0).toString();
    }

    @Override
    public void exitVarDecl(grammerParser.VarDeclContext ctx) {
        super.exitVarDecl(ctx);
    }

    @Override
    public void exitFunc(grammerParser.FuncContext ctx) {
        int paramNum;
        Function thisFunc;
        String funcName = ctx.getChild(0).toString();
        if (varsManager.consultVar(funcName) == null ||
                varsManager.consultVar(funcName).getType() != basicFinal.FUNCTION)//处理未定义函数
            System.exit(8);
        if (varsManager.consultVar(funcName).getType() == basicFinal.FUNCTION) {
            assert (varsManager.consultVar(funcName).getInfo() instanceof Function);
            thisFunc = (Function) varsManager.consultVar(funcName).getInfo();
        } else {
            System.exit(-1);
            return;
        }

        paramNum = ctx.getChildCount() < 4 ? 0 :
                ((ctx.getChild(2).getChildCount() - 1) / 2 + 1);
        if (thisFunc.getParamNum() != paramNum) System.exit(9);
        ArrayList<Integer> params = new ArrayList<>();
        for (int i = paramNum - 1; i >= 0; i--) {
            params.add(paramNum - 1 - i, Integer.parseInt(stack.pop().getContext()));
        }
        nodeInStack thisNode = Calculator.FunctionCaller(funcName, thisFunc.getType(), params, cmdBuffer, registerManager);
        if (thisFunc.getType() != basicFinal.VOID) {
            stack.push(thisNode);
        }

    }

    @Override
    public void exitUnary(grammerParser.UnaryContext ctx) {
        nodeInStack right = stack.pop();
        String operator = ctx.getChild(0).toString();
        stack.push(Calculator.unaryOperation(right, operator, registerManager, cmdBuffer));
    }

    @Override
    public void exitSingle(grammerParser.SingleContext ctx) {
        String newName = ctx.getChild(0).toString();
        varsManager.addVar(newName, top_var_del_type, registerManager, cmdBuffer);
    }

    @Override
    public void exitInitial(grammerParser.InitialContext ctx) {
        String newName = ctx.getChild(0).toString();
        nodeInStack right = stack.pop();
        varsManager.addVar(newName, top_var_del_type, registerManager, right, cmdBuffer);
    }

    @Override
    public void enterConstDecl(grammerParser.ConstDeclContext ctx) {
        top_var_del_type = ctx.getChild(1).toString();
    }

    @Override
    public void exitConstDef(grammerParser.ConstDefContext ctx) {
        nodeInStack right = stack.pop();
        if (right.getType() != dataStructure.basicFinal.IS_NUM) System.exit(6);
        String name = ctx.getChild(0).toString();
        varsManager.addConstVar(name, top_var_del_type, right.getContext());
        nodeInStack thisNode = new nodeInStack(right.getContext(), dataStructure.basicFinal.IS_NUM,
                dataStructure.basicFinal.I32, true);
        stack.push(thisNode);
    }

    @Override
    public void exitFuncRParams(grammerParser.FuncRParamsContext ctx) {
    }

    @Override
    public void enterWhileState(grammerParser.WhileStateContext ctx) {
        blockManager.enterWhileBlock(registerManager);
        WhileBlockInfo thisBlockInfo = blockManager.getCurrentWhileInfo();
        BasicLlvmPrinter.printBr(thisBlockInfo.getWhileStateCode(), cmdBuffer);
        cmdBuffer.addToOperateBuffer(thisBlockInfo.getWhileStateCode().substring(1) + ":");
    }

    @Override
    public void exitWhileState(grammerParser.WhileStateContext ctx) {
        nodeInStack right = stack.pop();
        WhileBlockInfo thisBlockInfo = blockManager.getCurrentWhileInfo();
        thisBlockInfo.setCondRegName(right.getContext());
        BasicLlvmPrinter.printBr(thisBlockInfo.getCondRegName(), thisBlockInfo.getWhileBlockCode(),
                thisBlockInfo.getNextBlockCode(), cmdBuffer);
        cmdBuffer.addToOperateBuffer(thisBlockInfo.getWhileBlockCode().substring(1) + ":");
    }

    @Override
    public void exitWhile(grammerParser.WhileContext ctx) {
        WhileBlockInfo thisBlockInfo = (WhileBlockInfo) blockManager.exitCurrentBlock();
        BasicLlvmPrinter.printBr(thisBlockInfo.getWhileStateCode(), cmdBuffer);
        cmdBuffer.addToOperateBuffer(thisBlockInfo.getNextBlockCode().substring(1) + ":");
    }

    @Override
    public void exitContinue(grammerParser.ContinueContext ctx) {
        BasicLlvmPrinter.printBr(blockManager.getCurrentWhileInfo().getWhileStateCode(), cmdBuffer);
    }

    @Override
    public void exitBreak(grammerParser.BreakContext ctx) {
        BasicLlvmPrinter.printBr(blockManager.getCurrentWhileInfo().getNextBlockCode(), cmdBuffer);
    }
}
