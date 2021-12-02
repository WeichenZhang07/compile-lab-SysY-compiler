package dataStructure.block;

public class IfInfo extends BlockInfo {
    String ifBlockCode, elseBlockCode, nextBlockCode;
    boolean ifReturned = false;
    boolean elseReturned = false;

    public void setElseReturned() {
        elseReturned = true;
    }

    public void setIfReturned() {
        ifReturned = true;
    }

    public boolean isFullyReturned() {
        return ifReturned && elseReturned;
    }

    public IfInfo(String ifBlockCode, String nextBlockCode) {
        super(IF_SINGLE);
        this.ifBlockCode = ifBlockCode;
        this.nextBlockCode = nextBlockCode;
    }

    public IfInfo(String ifBlockCode, String elseBlockCode, String nextBlockCode) {
        super(IF_ELSE);
        this.ifBlockCode = ifBlockCode;
        this.elseBlockCode = elseBlockCode;
        this.nextBlockCode = nextBlockCode;
    }

    public String getIfBlockCode() {
        return ifBlockCode;
    }

    public void setIfBlockCode(String ifBlockCode) {
        this.ifBlockCode = ifBlockCode;
    }

    public String getElseBlockCode() {
        return elseBlockCode;
    }

    public void setElseBlockCode(String elseBlockCode) {
        this.elseBlockCode = elseBlockCode;
    }

    public String getNextBlockCode() {
        return nextBlockCode;
    }

    public void setNextBlockCode(String nextBlockCode) {
        this.nextBlockCode = nextBlockCode;
    }
}
