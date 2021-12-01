package dataStructure;
import dataStructure.VarType.VarType;

public class Var {
    String name; //变量名
    int type; //变量类型
    String constContent; //常值变量的值
    VarType VarInfo; //函数变量详细信息
    String regisCode;
    boolean isConst;

    public Var() {

    }

    public Var(String name, int type, String regisCode) {
        this();
        this.name = name;
        this.type = type;
        this.regisCode = regisCode;
        this.isConst = false;
    }

    public Var(String name, int type, String regisCode, String constContent) {
        this(name, type, regisCode);
        this.isConst = true;
        this.constContent = constContent;
    }

    public Var(String name, int type, String regisCode, VarType VarInfo) {
        super();
        this.name = name;
        this.type = type;
        this.regisCode = regisCode;
        this.VarInfo = VarInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getConstContent() {
        return constContent;
    }

    public void setConstContent(String constContent) {
        this.constContent = constContent;
    }

    public VarType getInfo() {
        return VarInfo;
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
