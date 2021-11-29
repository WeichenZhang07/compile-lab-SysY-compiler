package tools;

import dataStructure.nodeInStack;

public class Calculator {
    public static final int IS_NUM = 0, IS_VAL = 1;

    public static final int I1 = 0, I32 = 1;

    public static nodeInStack compare(nodeInStack left, nodeInStack right, String operator, RegisterManager reg,
                                      llvmCmdBuffer buffer) {
        nodeInStack thisNode;
        int thisVarType = BasicLlvmPrinter.zext(left, right, reg, buffer);
        if (right.getType() == IS_NUM && left.getType() == IS_NUM) {
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
                default -> {
                    r = false;
                    System.exit(-1);
                }
            }
            thisNode = new nodeInStack(r ? "1" : "0", IS_NUM, I1, right.isConst() && left.isConst());
        } //若能够在编译过程中得出条件运算结果
        else {
            String thisCode = reg.allocateTemperSpace();
            thisNode = new nodeInStack(thisCode, IS_VAL, I1, right.isConst() && left.isConst());
            BasicLlvmPrinter.printIcmp(left.getContext(), right.getContext(), thisCode, operator, buffer);
        }
        return thisNode;
    }

    public static nodeInStack BinaryOperation(nodeInStack left, nodeInStack right, String operator, RegisterManager reg,
                                              llvmCmdBuffer buffer) {
        String operateCode;
        nodeInStack thisNode;
        if (left.getType() == IS_NUM && right.getType() == IS_NUM) {
            int leftNum = Integer.parseInt(left.getContext()), rightNum = Integer.parseInt(right.getContext());
            int result = switch (operator) {
                case "+" -> leftNum + rightNum;
                case "-" -> leftNum - rightNum;
                case "*" -> leftNum * rightNum;
                case "/" -> leftNum / rightNum;
                case "%" -> leftNum % rightNum;
                default -> 0;
            };
            thisNode = new nodeInStack(Integer.toString(result), IS_NUM, I32, right.isConst() && left.isConst());
        } else {
            String newCode = reg.allocateTemperSpace();
            operateCode = switch (operator) {
                case "+" -> "add";
                case "-" -> "sub";
                case "*" -> "mul nsw";
                case "/" -> "sdiv";
                case "%" -> "srem";
                default -> null;
            };
            BasicLlvmPrinter.printBinaryOp(left.getContext(), right.getContext(), newCode, operateCode, buffer);
            thisNode = new nodeInStack(newCode, IS_VAL, I32, left.isConst() && right.isConst());
        }
        return thisNode;
    }

    public static nodeInStack unaryOperation(nodeInStack right, String operator, RegisterManager reg) {
        nodeInStack thisNode = right;
        if (right.getType() != IS_VAL) {
            int thisValue = Integer.parseInt(right.getContext());
            if (operator.equals("-")) {
                thisNode = new nodeInStack(Integer.toString(-thisValue), IS_NUM, right.getVarType(), right.isConst());
            } else if (operator.equals("!")) {
                thisNode = new nodeInStack(Integer.toString(thisValue == 0 ? 1 : 0), IS_NUM, I1, right.isConst());
            } else {
                thisNode = new nodeInStack(Integer.toString(thisValue), IS_NUM, right.getVarType(), right.isConst());
            }

        } else {
            String tmp = "";
            if (operator.equals("-")) {
                if (right.getVarType() != I32) {
                    String thisCode = reg.allocateTemperSpace();
                    BasicLlvmPrinter.align();
                    System.out.println(thisCode + " = zext i1 " + right.getContext() + " to i32");
                    right.setVarType(I32);
                    right.setContext(thisCode);
                }
                String thisCode = reg.allocateTemperSpace();
                tmp += (thisCode + " = " + "sub " + "i32 0, " + right.getContext());
                BasicLlvmPrinter.align();
                System.out.println(tmp);
                thisNode = new nodeInStack(thisCode, IS_VAL, right.getVarType(), right.isConst());
            } else if (operator.equals("!")) {
                String thisCode = reg.allocateTemperSpace();
                tmp += (thisCode + " = " + "icmp eq " + (right.getVarType() == I32 ? "i32 " : "i1 ") +
                        right.getContext() + ", " +
                        "0");
                BasicLlvmPrinter.align();
                System.out.println(tmp);
                thisNode = new nodeInStack(thisCode, IS_VAL, I1, right.isConst());
            }

        }
        return thisNode;
    }
}
