package dataStructure;

public class Var {
    String name; //变量名
    String type; //变量类型
    String constContent; //常值变量的值
    Function funcInfo; //函数变量详细信息
    String regisCode;
    boolean isConst;

    public Var() {

    }

    public Var(String name, String type, String regisCode) {
        this();
        this.name = name;
        this.type = type;
        this.regisCode = regisCode;
        this.isConst = false;
    }

    public Var(String name, String type, String regisCode, String constContent) {
        this(name, type, regisCode);
        this.isConst = true;
        this.constContent = constContent;
    }

    public Var(String name, String type, String regisCode, Function funcInfo) {
        super();
        this.name = name;
        this.type = type;
        this.regisCode = regisCode;
        this.funcInfo = funcInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getConstContent() {
        return constContent;
    }

    public void setConstContent(String constContent) {
        this.constContent = constContent;
    }

    public Function getFuncInfo() {
        return funcInfo;
    }

    public void setFuncInfo(Function funcInfo) {
        this.funcInfo = funcInfo;
    }

    public String getRegisCode() {
        return regisCode;
    }

    public void setRegisCode(String regisCode) {
        this.regisCode = regisCode;
    }

    public boolean isConst() {
        return isConst;
    }

    public void setConst(boolean aConst) {
        isConst = aConst;
    }
}
