package dataStructure.block;

public class CondBlock extends BlockInfo {
    String firstCode, secondCode, nextCode;
    String resultRegSpace;

    public CondBlock(String firstCode, String secondCode,  String nextCode, String resultRegSpace) {
        super(BlockInfo.COND);
        this.firstCode = firstCode;
        this.secondCode = secondCode;
        this.nextCode = nextCode;
        this.resultRegSpace = resultRegSpace;
    }

    public String getFirstCode() {
        return firstCode;
    }

    public String getSecondCode() {
        return secondCode;
    }

    public String getNextCode() {
        return nextCode;
    }

    public String getResultRegSpace() {
        return resultRegSpace;
    }

}
