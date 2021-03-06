package tools;

import dataStructure.basicFinal;
import dataStructure.nodeInStack;

import java.util.ArrayList;

public class BasicLlvmPrinter {
    public static int zext(nodeInStack a, nodeInStack b, RegisterManager reg, llvmCmdBuffer buffer) {
        if (a.getVarType() == b.getVarType()) {
            return 0;
        }
        String regCode = reg.allocateTemperSpace();
        if (a.getVarType() < b.getVarType()) {
            buffer.addToOperateBuffer(regCode + " = zext i1 " + a.getContext() +
                    " to i32");
        } else if (a.getVarType() > b.getVarType()) {
            buffer.addToOperateBuffer(regCode + " = zext i1 " + b.getContext() +
                    " to i32");
        }
        a.setVarType(basicFinal.I32);
        a.setContext(regCode);
        return Integer.max(a.getVarType(), b.getVarType());
    }

    public static void align() {
        System.out.print("   ");
    }

    public static void printBinaryOp(String var1, String var2, String register, String operator, llvmCmdBuffer buffer) {
        buffer.addToOperateBuffer(register + " = " + operator + " i32 " + var1 + " , " + var2);
    }

    public static void printIcmp(String var1, String var2, String register, String method, llvmCmdBuffer buffer) {
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
            case ("!=") -> {
                cd = "ne";
            }
            default -> {
                cd = "";
            }
        }
        buffer.addToOperateBuffer(register + " = icmp " + cd + " i32 " + var1 + " , " + var2);
    }

    public static void printBr(String cond, String ifTrue, String ifFalse, llvmCmdBuffer buffer) {
        buffer.addToOperateBuffer("br i1 " + cond + ", label " + ifTrue + ", label " + ifFalse);
    }

    public static void printBr(String dest, llvmCmdBuffer buffer) {
        buffer.addToOperateBuffer("br label " + dest);
    }

    public static void printLogic(String var1, String var2, String register, String operation, llvmCmdBuffer buffer) {
        buffer.addToOperateBuffer(register + " = " + operation + " i1 " + var1 + ", " + var2);
    }

    public static void printGEP(String type, String varName, String register, int offset, llvmCmdBuffer buffer) {
        buffer.addToOperateBuffer(register + " = getelementptr " + type + ", " + type + "* " + varName
                + " , i32 0, i32 " + offset);
    }

    public static void printGEP(String type, String varName, String register, String offset, llvmCmdBuffer buffer) {
        buffer.addToOperateBuffer(register + " = getelementptr " + type + ", " + type + "* " + varName
                + (type.equals("i32") ? " , i32 " : " , i32 0, i32 ") + offset);
    }

    public static void printStore(String source, String destination, llvmCmdBuffer buffer) {
        buffer.addToOperateBuffer("store i32 " + source + " , i32* " + destination);
    }
}
