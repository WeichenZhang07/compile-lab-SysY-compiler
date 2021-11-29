package dataStructure;

public class nodeInStack {
    String context;
    int type;
    int varType;
    boolean isConst;

    public nodeInStack() {
        this.type = -1;
        isConst = false;
    }

    public nodeInStack(String context, int type, int varType, boolean isConst) {
        this.context = context;
        this.type = type;
        this.varType = varType;
        this.isConst = isConst;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getVarType() {
        return varType;
    }

    public void setVarType(int varType) {
        this.varType = varType;
    }

    public boolean isConst() {
        return this.isConst;
    }

    public void setNotConst() {
        this.isConst = false;
    }
}
