package tools;

public class BasicLlvmPrinter {
    public static void align(){
        System.out.print("   ");
    }

    public static void printAdd(String var1, String var2, String register) {
        System.out.println(register + " = " + "add i32" + var1 + " , " + var2);
    }

    public static void printSub(String var1, String var2, String register) {
        System.out.println(register + " = " + "sub i32" + var1 + " , " + var2);
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
        System.out.println(register + " = icmp " + cd + " " + var1 + " , " + var2);
    }
}
