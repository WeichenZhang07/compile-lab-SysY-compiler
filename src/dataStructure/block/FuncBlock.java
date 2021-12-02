package dataStructure.block;

public class FuncBlock extends BlockInfo {
    int retType;
    String name;
    boolean returned;

    public FuncBlock(int retType, String name) {
        super(BlockInfo.Function);
        this.retType = retType;
        this.name = name;
        this.returned = false;
    }

    public void setReturned() {
        returned = true;
    }

    public boolean isReturned() {
        return returned;
    }

    public int getRetType(){
        return  retType;
    }

    public String getName() {
        return name;
    }
}
