package dataStructure;

import java.util.HashMap;

public class basicFinal {
    public static final int IS_NUM = 0, IS_VAL = 1;
    public static final int I1 = 0, I32 = 1, ARRAY = 2, FUNCTION = 3, VOID = 4, I32_P = 2;
    private static final HashMap<Integer, String> typeMapI2S = new HashMap<>();
    private static final HashMap<String, Integer> typeMapS2I = new HashMap<>();

    static {
        typeMapI2S.put(I1, "i1");
        typeMapS2I.put("i1", I1);
        typeMapS2I.put("bool",I1);
        typeMapI2S.put(I32, "i32");
        typeMapI2S.put(I32_P, "i32*");
        typeMapS2I.put("i32*",I32_P);
        typeMapS2I.put("i32", I32);
        typeMapS2I.put("int",I32);
        typeMapS2I.put("int*",I32_P);
        typeMapI2S.put(FUNCTION, "FUNCTION");
        typeMapS2I.put("FUNCTION", FUNCTION);
        typeMapI2S.put(VOID, "void");
        typeMapS2I.put("void", VOID);
    }

    public static int getIntTypeByString(String type) {
        return typeMapS2I.get(type);
    }

    public static String getStringTypeByInt(int type) {
        return typeMapI2S.get(type);
    }
}
