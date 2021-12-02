package dataStructure;

import dataStructure.VarType.Array;

public class FuncParamNode {
    String name;
    int type;
    Array arrayInfo = null;

    public FuncParamNode(String name, int type) {
        this.name = name;
        this.type = type;
    }

    public FuncParamNode(String name, int type, Array arrayInfo) {
        this.name = name;
        this.type = type;
        this.arrayInfo = arrayInfo;
    }//传入的dims数组最高维必须有0作为占位符

    public boolean isArrayPtr() {
        return (!(arrayInfo == null));
    }

    public String getName() {
        return this.name;
    }

    public int getType() {
        return this.type;
    }

    public Array getArrayInfo() {
        return this.arrayInfo;
    }
}
