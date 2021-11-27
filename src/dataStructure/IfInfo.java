package dataStructure;

public class IfInfo {
    static final int IF_SINGLE = 0, IF_ELSE = 1;
    int type;
    String ifBlockCode;
    String elseBlockCode;
    String nextBlockCode;

    public IfInfo(String ifBlockCode, String nextBlockCode) {
        type = IF_SINGLE;
        this.ifBlockCode = ifBlockCode;
        this.nextBlockCode = nextBlockCode;
    }

    public IfInfo(String ifBlockCode, String elseBlockCode, String nextBlockCode) {
        type = IF_ELSE;
        this.elseBlockCode = elseBlockCode;
        this.ifBlockCode = ifBlockCode;
        this.nextBlockCode = nextBlockCode;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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