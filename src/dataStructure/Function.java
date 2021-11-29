package dataStructure;

public class  Function {
    String name;
    String type;
    int paramNum;
    String[] paramsType;

    public Function(String name, String type, int paramNum,
                    String[] paramsType) {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
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
