package tools;

import dataStructure.nodeInStack;

public class BasicLlvmPrinter {
    public static final int IS_NUM = 0, IS_VAL = 1;

    public static final int I1 = 0, I32 = 1;

    public static int zext(nodeInStack a, nodeInStack b, RegisterManager reg) {
        if (a.getVarType() == b.getVarType()) {
            return 0;
        }
        String regCode = reg.allocateTemperSpace();
        if (a.getVarType() < b.getVarType()) {
            System.out.println(regCode + " = zext i1 " + a.getContext() +
                    "to i32");
        } else if (a.getVarType() > b.getVarType()) {
            System.out.println(regCode + " = zext i1 " + b.getContext() +
                    "to i32");
        }
        a.setVarType(I32);
        a.setContext(regCode);
        return Integer.max(a.getVarType(), b.getVarType());
    }

    public static void align() {
        System.out.print("   ");
    }

    public static void printBinaryOp(String var1, String var2, String register, String operator) {
        align();
        System.out.println(register + " = " + operator + " i32 " + var1 + " , " + var2);
    }

    public static void printIcmp(String var1, String var2, String register, String method) {
        String cd;
        switch (method) {
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
                cd = "";
            }
        }
        align();
        System.out.println(register + " = icmp " + cd + " i32 " + var1 + " , " + var2);
    }

    public static void printBr(String cond, String ifTrue, String ifFalse) {
        align();
        System.out.println("br i1 " + cond + ", label " + ifTrue + ", label " + ifFalse);
    }

    public static void printBr(String dest) {
        align();
        System.out.println("br label " + dest);
    }
}
