package tools;

import dataStructure.Var;
import dataStructure.VarType.Function;
import dataStructure.basicFinal;
import dataStructure.nodeInStack;

import java.util.ArrayList;

public class Calculator {


    public static nodeInStack compare(nodeInStack left, nodeInStack right, String operator, RegisterManager reg,
                                      llvmCmdBuffer buffer) {
        nodeInStack thisNode;
        int thisVarType = BasicLlvmPrinter.zext(left, right, reg, buffer);
        if (right.getType() == basicFinal.IS_NUM && left.getType() == basicFinal.IS_NUM) {
            boolean r;
            switch (operator) {
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
                case ("!=") -> {
                    r = Integer.parseInt(left.getContext()) !=
                            Integer.parseInt(right.getContext());
                }
                default -> {
                    r = false;
                    System.exit(-1);
                }
            }
            thisNode = new nodeInStack(r ? "1" : "0", basicFinal.IS_NUM, basicFinal.I1, right.isConst() && left.isConst());
        } //若能够在编译过程中得出条件运算结果
        else {
            String thisCode = reg.allocateTemperSpace();
            thisNode = new nodeInStack(thisCode, basicFinal.IS_VAL, basicFinal.I1, right.isConst() && left.isConst());
            BasicLlvmPrinter.printIcmp(left.getContext(), right.getContext(), thisCode, operator, buffer);
        }
        return thisNode;
    }

    public static nodeInStack BinaryOperation(nodeInStack left, nodeInStack right, String operator, RegisterManager reg,
                                              llvmCmdBuffer buffer) {
        String operateCode;
        nodeInStack thisNode;
        if (left.getType() == basicFinal.IS_NUM && right.getType() == basicFinal.IS_NUM) {
            int leftNum = Integer.parseInt(left.getContext()), rightNum = Integer.parseInt(right.getContext());
            int result = switch (operator) {
                case "+" -> leftNum + rightNum;
                case "-" -> leftNum - rightNum;
                case "*" -> leftNum * rightNum;
                case "/" -> leftNum / rightNum;
                case "%" -> leftNum % rightNum;
                default -> 0;
            };
            thisNode = new nodeInStack(Integer.toString(result), basicFinal.IS_NUM, basicFinal.I32,
                    right.isConst() && left.isConst());
        } else {
            String newCode = reg.allocateTemperSpace();
            operateCode = switch (operator) {
                case "+" -> "add";
                case "-" -> "sub";
                case "*" -> "mul nsw";
                case "/" -> "sdiv";
                case "%" -> "srem";
                default -> operator;
            };
            BasicLlvmPrinter.printBinaryOp(left.getContext(), right.getContext(), newCode, operateCode, buffer);
            thisNode = new nodeInStack(newCode, basicFinal.IS_VAL, basicFinal.I32,
                    left.isConst() && right.isConst());
        }
        return thisNode;
    }

    public static nodeInStack unaryOperation(nodeInStack right, String operator, RegisterManager reg,
                                             llvmCmdBuffer buffer) {
        nodeInStack thisNode = right;
        if (right.getType() != basicFinal.IS_VAL) {
            int thisValue = Integer.parseInt(right.getContext());
            if (operator.equals("-")) {
                thisNode = new nodeInStack(Integer.toString(-thisValue), basicFinal.IS_NUM, right.getVarType(), right.isConst());
            } else if (operator.equals("!")) {
                thisNode = new nodeInStack(Integer.toString(thisValue == 0 ? 1 : 0), basicFinal.IS_NUM, basicFinal.I1, right.isConst());
            } else {
                thisNode = new nodeInStack(Integer.toString(thisValue), basicFinal.IS_NUM, right.getVarType(), right.isConst());
            }

        } else {
            String tmp = "";
            if (operator.equals("-")) {
                if (right.getVarType() != basicFinal.I32) {
                    String thisCode = reg.allocateTemperSpace();
                    buffer.addToOperateBuffer(thisCode + " = zext i1 " + right.getContext() + " to i32");
                    right.setVarType(basicFinal.I32);
                    right.setContext(thisCode);
                }
                String thisCode = reg.allocateTemperSpace();
                tmp += (thisCode + " = " + "sub " + "i32 0, " + right.getContext());
                BasicLlvmPrinter.align();
                System.out.println(tmp);
                thisNode = new nodeInStack(thisCode, basicFinal.IS_VAL, right.getVarType(), right.isConst());
            } else if (operator.equals("!")) {
                String thisCode = reg.allocateTemperSpace();
                tmp += (thisCode + " = " + "icmp eq " + (right.getVarType() == basicFinal.I32 ? "i32 " : "i1 ") +
                        right.getContext() + ", " +
                        "0");
                buffer.addToOperateBuffer(tmp);
                thisNode = new nodeInStack(thisCode, basicFinal.IS_VAL, basicFinal.I1, right.isConst());
            }

        }
        return thisNode;
    }

    public static nodeInStack logicalOperation(nodeInStack left, nodeInStack right, String operator,
                                               RegisterManager reg, llvmCmdBuffer buffer) {
        nodeInStack thisNode;
        if (right.getType() == basicFinal.IS_NUM && left.getType() == basicFinal.IS_NUM) {
            boolean r = false;
            switch (operator) {
                case ("&&") -> {
                    r = Integer.parseInt(left.getContext()) != 0 && Integer.parseInt(right.getContext()) != 0;
                }
                case ("||") -> {
                    r = Integer.parseInt(left.getContext()) != 0 || Integer.parseInt(right.getContext()) != 0;
                }
                default -> {
                    System.exit(-1);
                }
            }
            thisNode = new nodeInStack(r ? "1" : "0", basicFinal.IS_NUM, basicFinal.I1,
                    left.isConst() && right.isConst());
        } else {
            String op = switch (operator) {
                case ("&&") -> "and";
                case ("||") -> "or";
                default -> "error";
            };
            String thisReg = reg.allocateTemperSpace();
            thisNode = new nodeInStack(thisReg, basicFinal.IS_VAL, basicFinal.I1,
                    left.isConst() && right.isConst());
            BasicLlvmPrinter.printLogic(left.getContext(), right.getContext(), thisReg, op, buffer);

        }
        return thisNode;
    }

    public static nodeInStack FunctionCaller(String funcName, ArrayList<String> params, llvmCmdBuffer buffer,
                                             RegisterManager reg, VarsManager varsManager) {
        Function funcInfo = (Function) varsManager.consultVar(funcName).getInfo();
        String retTypeString = basicFinal.getStringTypeByInt(funcInfo.getType());
        nodeInStack thisNode;
        StringBuilder cmd = new StringBuilder();
        String thisRegSpace = "";
        if (funcInfo.getType() != basicFinal.VOID) {
            thisRegSpace = reg.allocateTemperSpace();
            cmd = new StringBuilder(thisRegSpace + " = ");
        }
        cmd.append("call ").append(retTypeString).append(" @").append(funcName).append("( ");
        int len = params.size();
        for (int i = 0; i < len; i++) {
            cmd.append(basicFinal.getStringTypeByInt(funcInfo.getParamsType().get(i))).append(" ")
                    .append(params.get(i));
            if (i < len - 1) cmd.append(", ");
        }
        cmd.append(" )");
        buffer.addToOperateBuffer(cmd.toString());
        thisNode = new nodeInStack(thisRegSpace, basicFinal.IS_VAL, funcInfo.getType(), false);
        return thisNode;
    }

}
