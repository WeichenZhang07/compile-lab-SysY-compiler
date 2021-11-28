package dataStructure.block;

public class WhileBlockInfo extends BlockInfo {
    String whileStateCode, whileBlockCode, nextBlockCode;

    public WhileBlockInfo(String whileStateCode, String whileBlockCode, String nextBlockCode, String condRegName) {
        super(WHILE);
        this.setWhileStateCode(whileStateCode);
        this.setWhileBlockCode(whileBlockCode);
        this.setNextBlockCode(nextBlockCode);
        this.condRegName = condRegName;
    }

    String condRegName;

    public String getWhileStateCode() {
        return whileStateCode;
    }

    public void setWhileStateCode(String whileStateCode) {
        this.whileStateCode = whileStateCode;
    }

    public String getWhileBlockCode() {
        return whileBlockCode;
    }

    public void setWhileBlockCode(String whileBlockCode) {
        this.whileBlockCode = whileBlockCode;
    }

    public String getNextBlockCode() {
        return nextBlockCode;
    }

    public void setNextBlockCode(String nextBlockCode) {
        this.nextBlockCode = nextBlockCode;
    }

    public String getCondRegName() {
        return condRegName;
    }

    public void setCondRegName(String condRegName) {
        this.condRegName = condRegName;
    }
}
