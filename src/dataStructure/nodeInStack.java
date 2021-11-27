package dataStructure;

public class nodeInStack {
    String context;
    int type;
    int varType;

    public nodeInStack() {
        this.type = -1;
    }


    public nodeInStack(String context, int type, int varType) {
        this.context = context;
        this.type = type;
        this.varType = varType;
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
}
