package tools;

import dataStructure.block.BlockInfo;
import dataStructure.block.IfInfo;
import dataStructure.block.WhileBlockInfo;

import java.util.Stack;

public class BlockManager {
    Stack<BlockInfo> blockInfoStack = new Stack<>();

    public void enterWhileBlock(RegisterManager reg) {
        String whileStateBlockCode = reg.allocateBlockSpace();
        String whileBlockCode = reg.allocateBlockSpace();
        String nextBlockCode = reg.allocateBlockSpace();
        WhileBlockInfo thisBlockInfo = new WhileBlockInfo(whileStateBlockCode, whileBlockCode,
                nextBlockCode, null);
        blockInfoStack.push(thisBlockInfo);
    }

    public WhileBlockInfo getCurrentWhileInfo() {
        for (int i = blockInfoStack.size() - 1; i >= 0; i--) {
            if (blockInfoStack.get(i) instanceof WhileBlockInfo) {
                return (WhileBlockInfo) blockInfoStack.get(i);
            }
        }
        return null;
    }

    public void enterIfSingleBlock(RegisterManager reg) {
        String ifBlockCode = reg.allocateBlockSpace();
        String nextBlockCode = reg.allocateBlockSpace();
        IfInfo thisBlockInfo = new IfInfo(ifBlockCode, nextBlockCode);
        blockInfoStack.push(thisBlockInfo);
    }

    public void enterIfElseBlock(RegisterManager reg) {
        String ifBlockCode = reg.allocateBlockSpace();
        String elseBlockCode = reg.allocateBlockSpace();
        String nextBlockCode = reg.allocateBlockSpace();
        IfInfo thisBlockInfo = new IfInfo(ifBlockCode, elseBlockCode, nextBlockCode);
        blockInfoStack.push(thisBlockInfo);

    }

    public IfInfo getCurrentIfInfo() {
        for (int i = blockInfoStack.size() - 1; i >= 0; i--) {
            if (blockInfoStack.get(i) instanceof IfInfo) {
                return (IfInfo) blockInfoStack.get(i);
            }
        }
        return null;
    }

    public BlockInfo exitCurrentBlock() {
        return blockInfoStack.pop();
    }

}
