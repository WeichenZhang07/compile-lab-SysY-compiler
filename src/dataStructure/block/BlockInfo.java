package dataStructure.block;

public class BlockInfo {
    public static final int IF_SINGLE = 0, IF_ELSE = 1, WHILE = 2, Function = 3;
    int type;

    BlockInfo(int BlockType) {
        type = BlockType;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}