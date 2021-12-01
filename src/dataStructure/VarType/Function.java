package dataStructure.VarType;

import  dataStructure.basicFinal;
import java.util.ArrayList;

public class  Function extends VarType{
    String name;
    int type;
    int paramNum;
    String[] paramsType;

    public Function(String name, int type, int paramNum,
                    String[] paramsType) {
        super();
        this.name = name;
        this.type = type;
        this.paramNum = paramNum;
        this.paramsType = paramsType;
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

    public int getParamNum() {
        return paramNum;
    }

    public void setParamNum(int paramNum) {
        this.paramNum = paramNum;
    }

    public String[] getParamsType() {
        return paramsType;
    }

    public void setParamsType(String[] paramsType) {
        this.paramsType = paramsType;
    }


}
