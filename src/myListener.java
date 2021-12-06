import dataStructure.*;
import dataStructure.VarType.Array;
import dataStructure.VarType.Function;
import dataStructure.block.CondBlock;
import dataStructure.block.IfInfo;
import dataStructure.block.WhileBlockInfo;
import dataStructure.FuncParamNode;
import gen.grammerParser;
import org.antlr.v4.runtime.ParserRuleContext;
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

    boolean isElse = false;

    int top_var_del_type; // tell exitVarDef() function what the type of the var is;


    Stack<nodeInStack> stack = new Stack<>(); //store information to be passed to higher layer
    ArrayList<FuncParamNode> paramList = new ArrayList<>();
    Stack<CondBlock> circuitStack = new Stack<>();

    private void BinaryExp(String operator) {
        nodeInStack right = stack.pop();
        nodeInStack left = stack.pop();
        int thisVarType = BasicLlvmPrinter.zext(left, right, registerManager, cmdBuffer);
        nodeInStack thisNode = Calculator.BinaryOperation(left, right, operator, registerManager, cmdBuffer);
        stack.push(thisNode);
    }

    private void arrayScriptsManage(String newName, int dimension, boolean isInit) {
        int[] dims = new int[dimension];
        for (int i = dimension - 1; i >= 0; i--) {
            nodeInStack right = stack.pop();
            if (!right.isConst()) {
                System.err.println("数组定义下标中存在无法在编译过程中确认的下标！");
                System.exit(12);
            }
            dims[i] = Integer.parseInt(right.getContext());
        }
        varsManager.addArray(newName, top_var_del_type, registerManager, cmdBuffer, isInit, dims);
    }

    private void arrayInitParser(int subCount, nodeInStack thisNode, boolean isConstInit) {
        Stack<nodeInStack> reversor = new Stack<>();
        for (int i = 0; i < subCount; i++) {
            if ((!stack.peek().isConst()) && isConstInit) {
                System.err.println("常量数组初始化值必须为常值");
                System.exit(13);
            }
            reversor.push(stack.pop());
        }
        while (!reversor.isEmpty()) {
            if (!reversor.peek().isConst()) thisNode.setNotConst();
            thisNode.addChild(reversor.pop());
        }
        stack.push(thisNode);
    }

    private void logicZext(nodeInStack right) {
        nodeInStack thisNode = right;
        if (right.getVarType() != basicFinal.I1) {
            thisNode = Calculator.compare(new nodeInStack("0", basicFinal.IS_NUM,
                    basicFinal.I32, true), right, "<", registerManager, cmdBuffer);
        }
        stack.push(thisNode);
    }

    @Override
    public void enterFuncDef(grammerParser.FuncDefContext ctx) {
        varsManager.enterBlock();

        System.out.print("define dso_local ");
        String Ident = ctx.getChild(1).toString();
        int funcType = basicFinal.getIntTypeByString(ctx.getChild(0).getChild(0).toString());
        System.out.print(basicFinal.getStringTypeByInt(funcType) + " ");
        System.out.print("@" + Ident + " ");
        if (ctx.getChildCount() == 4) {
            System.out.print("( )");
        }
    }

    @Override
    public void exitFuncDef(grammerParser.FuncDefContext ctx) {

        int funcType = basicFinal.getIntTypeByString(ctx.getChild(0).getChild(0).toString());
        String Ident = ctx.getChild(1).toString();
        Function thisFunc = new Function(Ident, funcType);
        blockManager.enterFunc(thisFunc);
        for (FuncParamNode thisNode : paramList) {
            if (thisNode.isArrayPtr()) {
                thisFunc.addParam(thisNode.getType(), thisNode.getArrayInfo());
            } else {
                thisFunc.addParam(thisNode.getType());
            }
        }
        System.out.println("{");
        varsManager.addFunction(Ident, funcType, thisFunc);
        paramList.clear();
    }

    @Override
    public void exitFunction(grammerParser.FunctionContext ctx) {
        blockManager.exitCurrentBlock(cmdBuffer);
        cmdBuffer.putsAllocate();
        cmdBuffer.putsOperate();
        System.out.println("}");
        varsManager.exitBlock();
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
        if (left.getType() == basicFinal.IS_NUM) System.exit(7);
        cmdBuffer.addToOperateBuffer("store i32 " + right.getContext() + ", i32* " + left.getContext());

    }

    @Override
    public void exitReturn(grammerParser.ReturnContext ctx) {
        if (ctx.getChildCount() == 3) {
            nodeInStack right = stack.pop();
            blockManager.ret(isElse, right.getVarType());
            cmdBuffer.addToOperateBuffer("ret i32 " + right.getContext());
        } else {
            blockManager.ret(isElse, basicFinal.VOID);
            cmdBuffer.addToOperateBuffer("ret void");
        }
    }

    @Override
    public void enterIf(grammerParser.IfContext ctx) {
        varsManager.enterBlock();
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
        cmdBuffer.addToOperateBuffer(thisInfo.getIfBlockCode().substring(1) + ":", false);
    }

    @Override
    public void enterNakedBlock(grammerParser.NakedBlockContext ctx) {
        varsManager.enterBlock();
    }

    @Override
    public void exitNakedBlock(grammerParser.NakedBlockContext ctx) {
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
        cmdBuffer.addToOperateBuffer(thisInfo.getElseBlockCode().substring(1) + ":", false);
        isElse = true;
    }

    @Override
    public void exitElseBlock(grammerParser.ElseBlockContext ctx) {
        IfInfo thisInfo = blockManager.getCurrentIfInfo();
        BasicLlvmPrinter.printBr(thisInfo.getNextBlockCode(), cmdBuffer);
        isElse = false;
    }

    @Override
    public void exitIf(grammerParser.IfContext ctx) {
        IfInfo thisInfo = (IfInfo) blockManager.exitCurrentBlock(cmdBuffer);
        cmdBuffer.addToOperateBuffer(thisInfo.getNextBlockCode().substring(1) + ":", false);
        varsManager.exitBlock();
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
        if (ctx.getChildCount() == 1) {
            if (thisVar.isConst()) {
                thisNode = new nodeInStack(thisVar.getConstContent(), dataStructure.basicFinal.IS_NUM,
                        dataStructure.basicFinal.I32, true);
            } else thisNode = new nodeInStack(code, dataStructure.basicFinal.IS_VAL, dataStructure.basicFinal.I32,
                    false);
        } else {
            int count = ctx.getChildCount() - 1;
            Array arrayInfo = (Array) thisVar.getInfo();
            if (count != arrayInfo.getDim()) {
                System.err.println("方括号个数必须和数组变量的维数相同!");
                System.exit(13);
            }
            nodeInStack[] nodes = new nodeInStack[count];
            for (int i = count - 1; i >= 0; i--) {
                nodes[i] = stack.pop();
            }
            String thisReg = registerManager.allocateTemperSpace();
            BasicLlvmPrinter.printGEP(arrayInfo.getArrType(), thisVar.getRegisCode(), thisReg,
                    arrayInfo.getOffset(registerManager, cmdBuffer, nodes).getContext(), cmdBuffer);
            thisNode = new nodeInStack(thisReg, basicFinal.IS_VAL, basicFinal.I32, thisVar.isConst());
        }
        stack.push(thisNode);
    }

    @Override
    public void exitRightLval(grammerParser.RightLvalContext ctx) {
        ParseTree tmp = ctx.getChild(0);
        String name = tmp.toString();
        Var thisVar = varsManager.consultVar(name);
        if (thisVar == null) {
            System.err.println("遇到未定义变量名！");
            System.exit(10);
        }
        String code = thisVar.getRegisCode();
        nodeInStack thisNode;
        if (ctx.getChildCount() == 1 && thisVar.getType() != basicFinal.I32_P) {
            if (thisVar.isConst()) {
                thisNode = new nodeInStack(thisVar.getConstContent(), dataStructure.basicFinal.IS_NUM,
                        thisVar.getType(), true);
            } else thisNode = new nodeInStack(code, dataStructure.basicFinal.IS_VAL, thisVar.getType(),
                    false);
        } else {
            int count = ctx.getChildCount() - 1;
            Array arrayInfo = (Array) thisVar.getInfo();
            nodeInStack[] nodes = new nodeInStack[count];
            for (int i = count - 1; i >= 0; i--) {
                nodes[i] = stack.pop();
            }
            String thisReg = registerManager.allocateTemperSpace();
            BasicLlvmPrinter.printGEP(arrayInfo.getArrType(), thisVar.getRegisCode(), thisReg,
                    arrayInfo.getOffset(registerManager, cmdBuffer, nodes).getContext(), cmdBuffer);
            thisNode = new nodeInStack(thisReg, basicFinal.IS_VAL,
                    count == (arrayInfo.getDim()) ? basicFinal.I32 : basicFinal.I32_P, thisVar.isConst());
        }
        stack.push(thisNode);
    }

    @Override
    public void exitExp(grammerParser.ExpContext ctx) {
        nodeInStack right = stack.pop();
        stack.push(right);// push exp to the stack
    }

    @Override
    public void exitSingleInitVal(grammerParser.SingleInitValContext ctx) {
        nodeInStack right = stack.pop();
        stack.push(right);// push exp to the stack
    }

    @Override
    public void exitArrayInitVal(grammerParser.ArrayInitValContext ctx) {
        int count = ctx.getChildCount();
        int subCount = (count - 2) / 2 + (count - 2) % 2;
        nodeInStack thisNode = new nodeInStack("null", basicFinal.ARRAY, basicFinal.I32, true);
        arrayInitParser(subCount, thisNode, false);
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
        thisNode = Calculator.compare(left, right, opC, registerManager, cmdBuffer);
        int s = isParentMultiCond(ctx);
        circuit1(thisNode, s);
        circuit2(thisNode, s);
        stack.push(thisNode);
    }

    @Override
    public void exitSingleEqExp(grammerParser.SingleEqExpContext ctx) {
        int s = isParentMultiCond(ctx);
        circuit1(stack.peek(), s);
        circuit2(stack.peek(), s);
    }

    private void circuit1(nodeInStack thisNode, int s) {
        if (s == 0) {
            CondBlock parentInfo = circuitStack.pop();
            BasicLlvmPrinter.printBr(parentInfo.getFirstCode(), cmdBuffer);
            cmdBuffer.addToOperateBuffer(parentInfo.getFirstCode().substring(1) + ":", false);
            BasicLlvmPrinter.printBr(thisNode.getContext(), parentInfo.getSecondCode(),
                    parentInfo.getNextCode(), cmdBuffer);
            cmdBuffer.addToOperateBuffer(parentInfo.getSecondCode().substring(1) + ":", false);
        }
    }

    private void circuit2(nodeInStack thisNode, int s) {
        if (s == 1) {
            CondBlock parentInfo = circuitStack.pop();
            BasicLlvmPrinter.printBr(parentInfo.getThirdCode(), cmdBuffer);
            cmdBuffer.addToOperateBuffer(parentInfo.getThirdCode().substring(1) + ":", false);
            BasicLlvmPrinter.printBr(parentInfo.getNextCode(), cmdBuffer);
        }
    }


    @Override
    public void enterMultipleLAndExp(grammerParser.MultipleLAndExpContext ctx) {
        blockManager.enterCondBlock(registerManager);
        CondBlock thisInfo = blockManager.getCurrentCondInfo();
        circuitStack.push(thisInfo);
        circuitStack.push(thisInfo);
    }

    public int isParentMultiCond(ParserRuleContext ctx) {
        if (ctx.getParent() instanceof grammerParser.MultipleLAndExpContext ||
                ctx.getParent() instanceof grammerParser.MultipleLOrExpContext) {
            if (ctx == ctx.getParent().getChild(0)) return 0;
            else if (ctx == ctx.getParent().getChild(2)) return 1;
        }
        return -1;
    }

    @Override
    public void exitMultipleLAndExp(grammerParser.MultipleLAndExpContext ctx) {
        nodeInStack right = stack.pop();
        nodeInStack left = stack.pop();
        CondBlock thisInfo = blockManager.getCurrentCondInfo();

        if (!(left.getVarType() == basicFinal.I1)) {
            logicZext(left);
            left = stack.pop();
        }

        String operator = "&&";
        int s = isParentMultiCond(ctx);
        nodeInStack andNode = Calculator.logicalOperation(left, right, operator, registerManager, cmdBuffer);
        circuit1(andNode, s);
        String regSpace = registerManager.allocateTemperSpace();
        BasicLlvmPrinter.printBr(thisInfo.getNextCode(), cmdBuffer);
        cmdBuffer.addToOperateBuffer(thisInfo.getNextCode().substring(1) + ":", false);
        cmdBuffer.addToOperateBuffer(regSpace + " = phi i1 [false, " + thisInfo.getFirstCode() + " ], [ " + andNode.getContext()
                + ", " + thisInfo.getThirdCode() + " ]");
        circuit2(andNode, s);
        nodeInStack thisNode = new nodeInStack(regSpace, basicFinal.IS_VAL, basicFinal.I1, false);
        stack.push(thisNode);
        blockManager.exitCurrentBlock(cmdBuffer);
    }

    @Override
    public void enterMultipleLOrExp(grammerParser.MultipleLOrExpContext ctx) {
        blockManager.enterCondBlock(registerManager);
        CondBlock thisInfo = blockManager.getCurrentCondInfo();
        circuitStack.push(thisInfo);
        circuitStack.push(thisInfo);
    }

    @Override
    public void exitMultipleLOrExp(grammerParser.MultipleLOrExpContext ctx) {
        nodeInStack right = stack.pop();
        nodeInStack left = stack.pop();
        CondBlock thisInfo = blockManager.getCurrentCondInfo();

        if (!(left.getVarType() == basicFinal.I1)) {
            logicZext(left);
            left = stack.pop();
        }

        String operator = "||";
        int s = isParentMultiCond(ctx);
        nodeInStack andNode = Calculator.logicalOperation(left, right, operator, registerManager, cmdBuffer);
        circuit1(andNode, s);
        String regSpace = registerManager.allocateTemperSpace();
        BasicLlvmPrinter.printBr(thisInfo.getNextCode(), cmdBuffer);
        cmdBuffer.addToOperateBuffer(thisInfo.getNextCode().substring(1) + ":", false);
        cmdBuffer.addToOperateBuffer(regSpace + " = phi i1 [true, " + thisInfo.getFirstCode() + " ], [ " + andNode.getContext()
                + ", " + thisInfo.getThirdCode() + " ]");
        circuit2(andNode, s);
        nodeInStack thisNode = new nodeInStack(regSpace, basicFinal.IS_VAL, basicFinal.I1, false);
        stack.push(thisNode);
        blockManager.exitCurrentBlock(cmdBuffer);
    }

    @Override
    public void exitPrimaryExp(grammerParser.PrimaryExpContext ctx) {
        if (ctx.getChild(0) instanceof grammerParser.RightLvalContext) {
            nodeInStack right = stack.pop();
            if (right.getType() == basicFinal.IS_VAL) {
                String thisCode = right.getContext();
                int thisVarType = right.getVarType();
                if (thisVarType != basicFinal.I32_P) {
                    thisCode = registerManager.allocateTemperSpace();
                    cmdBuffer.addToOperateBuffer(thisCode + " = load " +
                            basicFinal.getStringTypeByInt(right.getType()) + " , " + basicFinal.getStringTypeByInt(right.getType())
                            + "* " + right.getContext());
                }
                nodeInStack thisNode = new nodeInStack(thisCode, basicFinal.IS_VAL, thisVarType, right.isConst());
                stack.push(thisNode);
            } else stack.push(right);
        }
    }

    @Override
    public void enterVarDecl(grammerParser.VarDeclContext ctx) {
        top_var_del_type = basicFinal.getIntTypeByString(ctx.getChild(0).toString());
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
        ArrayList<String> params = new ArrayList<>();
        for (int i = 0; i < paramNum; i++) {
            params.add("");
        }
        for (int i = paramNum - 1; i >= 0; i--) {
            params.set(i, stack.pop().getContext());
        }
        nodeInStack thisNode = Calculator.FunctionCaller(funcName, params, cmdBuffer, registerManager, varsManager);
        stack.push(thisNode);

    }

    @Override
    public void exitUnary(grammerParser.UnaryContext ctx) {
        nodeInStack right = stack.pop();
        String operator = ctx.getChild(0).getChild(0).toString();
        stack.push(Calculator.unaryOperation(right, operator, registerManager, cmdBuffer));
    }

    @Override
    public void exitSingle(grammerParser.SingleContext ctx) {
        String newName = ctx.getChild(0).toString();
        if (ctx.getChildCount() == 1) {
            varsManager.addVar(newName, top_var_del_type, registerManager, cmdBuffer);
        }//0维变量初始化
        else {
            int dimension = ctx.getChildCount() - 1;
            arrayScriptsManage(newName, dimension, false);
        }
    }

    @Override
    public void exitInitial(grammerParser.InitialContext ctx) {
        String newName = ctx.getChild(0).toString();
        if (ctx.getChildCount() == 3) {
            nodeInStack right = stack.pop();
            varsManager.addVar(newName, top_var_del_type, registerManager, right, cmdBuffer);
        } else {
            nodeInStack initVal = stack.pop();
            int dimension = ctx.getChildCount() - 3;
            arrayScriptsManage(newName, dimension, true);
            Var thisArray = varsManager.consultVar(newName);
            varsManager.ArrayInitializer(thisArray, initVal, cmdBuffer, registerManager, varsManager);
        }
    }

    @Override
    public void enterConstDecl(grammerParser.ConstDeclContext ctx) {
        top_var_del_type = basicFinal.getIntTypeByString(ctx.getChild(1).toString());
    }

    @Override
    public void exitConstDef(grammerParser.ConstDefContext ctx) {
        nodeInStack right = stack.pop();
        if (!right.isConst()) System.exit(6);
        String name = ctx.getChild(0).toString();
        nodeInStack thisNode;
        if (ctx.getChildCount() == 3) {
            varsManager.addConstVar(name, top_var_del_type, right.getContext());
            //thisNode = new nodeInStack(right.getContext(), basicFinal.IS_NUM, basicFinal.I32, true);
        } else {
            int dimension = ctx.getChildCount() - 3;
            arrayScriptsManage(name, dimension, true);
            Var thisArray = varsManager.consultVar(name);
            varsManager.ArrayInitializer(thisArray, right, cmdBuffer, registerManager, varsManager);
        }
        //stack.push(thisNode);

    }

    @Override
    public void exitFuncRParams(grammerParser.FuncRParamsContext ctx) {
    }

    @Override
    public void enterWhileState(grammerParser.WhileStateContext ctx) {
        blockManager.enterWhileBlock(registerManager);
        WhileBlockInfo thisBlockInfo = blockManager.getCurrentWhileInfo();
        BasicLlvmPrinter.printBr(thisBlockInfo.getWhileStateCode(), cmdBuffer);
        cmdBuffer.addToOperateBuffer(thisBlockInfo.getWhileStateCode().substring(1) + ":", false);
    }

    @Override
    public void enterWhile(grammerParser.WhileContext ctx) {
        varsManager.enterBlock();
    }

    @Override
    public void exitWhileState(grammerParser.WhileStateContext ctx) {
        nodeInStack right = stack.pop();
        WhileBlockInfo thisBlockInfo = blockManager.getCurrentWhileInfo();
        thisBlockInfo.setCondRegName(right.getContext());
        BasicLlvmPrinter.printBr(thisBlockInfo.getCondRegName(), thisBlockInfo.getWhileBlockCode(),
                thisBlockInfo.getNextBlockCode(), cmdBuffer);
        cmdBuffer.addToOperateBuffer(thisBlockInfo.getWhileBlockCode().substring(1) + ":", false);
    }

    @Override
    public void exitWhile(grammerParser.WhileContext ctx) {
        WhileBlockInfo thisBlockInfo = (WhileBlockInfo) blockManager.exitCurrentBlock(cmdBuffer);
        varsManager.exitBlock();
        BasicLlvmPrinter.printBr(thisBlockInfo.getWhileStateCode(), cmdBuffer);
        cmdBuffer.addToOperateBuffer(thisBlockInfo.getNextBlockCode().substring(1) + ":", false);
    }

    @Override
    public void exitContinue(grammerParser.ContinueContext ctx) {
        BasicLlvmPrinter.printBr(blockManager.getCurrentWhileInfo().getWhileStateCode(), cmdBuffer);
    }

    @Override
    public void exitBreak(grammerParser.BreakContext ctx) {
        BasicLlvmPrinter.printBr(blockManager.getCurrentWhileInfo().getNextBlockCode(), cmdBuffer);
    }

    @Override
    public void exitArrayConstInitVal(grammerParser.ArrayConstInitValContext ctx) {
        int count = ctx.getChildCount();
        int subCount = (count - 2) / 2 + (count - 2) % 2;
        nodeInStack thisNode = new nodeInStack("null", basicFinal.IS_VAL, basicFinal.I32, true);
        arrayInitParser(subCount, thisNode, true);
    }

    @Override
    public void exitSingleLAndExp(grammerParser.SingleLAndExpContext ctx) {
        logicZext(stack.pop());
        int s = isParentMultiCond(ctx);
        circuit1(stack.peek(), s);
        circuit2(stack.peek(), s);
    }

    @Override
    public void exitSingleLOrExp(grammerParser.SingleLOrExpContext ctx) {
        logicZext(stack.pop());
        int s = isParentMultiCond(ctx);
        circuit1(stack.peek(), s);
        circuit2(stack.peek(), s);
    }

    @Override
    public void exitFuncFParam(grammerParser.FuncFParamContext ctx) {
        int count = ctx.getChildCount();
        String name = ctx.getChild(1).toString();
        int type = basicFinal.getIntTypeByString(ctx.getChild(0).toString());
        if (count == 2) {
            FuncParamNode thisNode = new FuncParamNode(name, type);
            paramList.add(thisNode);
        } else {
            int numOfScripts = count - 4;
            int[] scripts = new int[numOfScripts + 1];
            scripts[0] = 0;
            for (int i = numOfScripts; i > 0; i--) {
                nodeInStack right = stack.pop();
                if (!(right.getType() == basicFinal.IS_NUM)) {
                    System.err.println("函数声明中形参数组长度必须为编译时可求值数量");
                }
                scripts[i] = Integer.parseInt(right.getContext());
            }
            Array arrayInfo = new Array(basicFinal.I32, scripts);
            FuncParamNode thisNode = new FuncParamNode(name, basicFinal.I32_P, arrayInfo);
            paramList.add(thisNode);
        }
    }

    @Override
    public void exitFuncFParams(grammerParser.FuncFParamsContext ctx) {
        System.out.print(" ( ");
        int size = paramList.size();
        for (int i = 0; i < size; i++) {
            FuncParamNode right = paramList.get(i);
            String regSpace, paraSpace;
            if (right.isArrayPtr()) {
                paraSpace = varsManager.addParamArrayPtr(right.getName(), right.getType(), registerManager,
                        right.getArrayInfo(), cmdBuffer);
            } else {
                paraSpace = registerManager.allocateTemperSpace();
                regSpace = varsManager.addVar(right.getName(), right.getType(), registerManager, cmdBuffer);
                cmdBuffer.addToOperateBuffer("store " + basicFinal.getStringTypeByInt(right.getType()) + " " + paraSpace +
                        " , " + basicFinal.getStringTypeByInt(right.getType()) + "* " + regSpace);
            }
            System.out.print(" " + basicFinal.getStringTypeByInt(right.getType()) + " " + paraSpace + " ");

            if (i < size - 1) System.out.print(", ");
        }
        System.out.print(")");
    }

}
