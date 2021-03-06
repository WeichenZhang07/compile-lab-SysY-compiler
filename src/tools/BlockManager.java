package tools;

import dataStructure.VarType.Function;
import dataStructure.basicFinal;
import dataStructure.block.*;

import java.util.Stack;

public class BlockManager {
    Stack<BlockInfo> blockInfoStack = new Stack<>();

    private FuncBlock getTopFunc() {
        for (int i = blockInfoStack.size() - 1; i >= 0; i--) {
            if (blockInfoStack.get(i) instanceof FuncBlock)
                return (FuncBlock) blockInfoStack.get(i);
        }
        return null;
    }

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

    public void enterCondBlock(RegisterManager reg) {
        String firstCode = reg.allocateBlockSpace();
        String secondCode = reg.allocateBlockSpace();
        String thirdBlock = reg.allocateBlockSpace();
        String nextCode = reg.allocateBlockSpace();
        String result = reg.allocateTemperSpace();
        CondBlock condBlock = new CondBlock(firstCode, secondCode, thirdBlock, nextCode, result);
        blockInfoStack.push(condBlock);
    }

    public CondBlock getCurrentCondInfo() {
        for (int i = blockInfoStack.size() - 1; i >= 0; i--) {
            if (blockInfoStack.get(i) instanceof CondBlock) {
                return (CondBlock) blockInfoStack.get(i);
            }
        }
        return null;
    }

    public IfInfo getCurrentIfInfo() {
        for (int i = blockInfoStack.size() - 1; i >= 0; i--) {
            if (blockInfoStack.get(i) instanceof IfInfo) {
                return (IfInfo) blockInfoStack.get(i);
            }
        }
        return null;
    }

    public BlockInfo exitCurrentBlock(llvmCmdBuffer buffer) {
        if (blockInfoStack.peek() instanceof IfInfo) {
            if (((IfInfo) blockInfoStack.peek()).isFullyReturned()) {
                FuncBlock top = getTopFunc();
                if (top == null) {
                    System.exit(-1);
                }
                getTopFunc().setReturned();
            }
        } else if (blockInfoStack.peek() instanceof FuncBlock) {
            FuncBlock thisBlock = (FuncBlock) blockInfoStack.peek();
            if (!thisBlock.isReturned()) {
                if (thisBlock.getRetType() == basicFinal.VOID) {
                    buffer.addToOperateBuffer("ret void");
                } else if (thisBlock.getName().equals("main")) {
                    buffer.addToOperateBuffer("ret i32 0");
                } else {
                    System.err.println("??????????????????");
                    System.exit(16);
                }
            } else {
                if (thisBlock.getRetType() == basicFinal.VOID) {
                    buffer.addToOperateBuffer("ret void");
                } else {
                    buffer.addToOperateBuffer("ret i32 0");
                }
            }
        }
        return blockInfoStack.pop();
    }

    public void enterFunc(Function funcInfo) {
        String funcName = funcInfo.getName();
        int retType = funcInfo.getType();
        blockInfoStack.push(new FuncBlock(retType, funcName));
    }

    public void ret(boolean isElse, int type) {
        if (type != getTopFunc().getRetType()) {
            System.err.println("????????????????????????");
            System.exit(16);
        }
        if (blockInfoStack.peek() instanceof IfInfo) {
            IfInfo thisInfo = (IfInfo) blockInfoStack.peek();
            if (isElse) {
                thisInfo.setElseReturned();
            } else {
                thisInfo.setIfReturned();
            }
        } else if (blockInfoStack.peek() instanceof FuncBlock) {
            FuncBlock thisInfo = (FuncBlock) blockInfoStack.peek();
            thisInfo.setReturned();
        }
    }

}
