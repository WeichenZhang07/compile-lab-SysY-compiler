package dataStructure;

import java.util.HashMap;

public class basicFinal {
    public static final int IS_NUM = 0, IS_VAL = 1;
    public static final int I1 = 0, I32 = 1, ARRAY = 2, FUNCTION = 3, VOID = 4;
    public static final HashMap<Integer, String> typeMap = new HashMap<>();

    static {
        typeMap.put(I1, "I1");
        typeMap.put(I32, "I32");
        typeMap.put(ARRAY, "ARRAY");
        typeMap.put(FUNCTION, "FUNCTION");
        typeMap.put(VOID, "void");
    }
}
