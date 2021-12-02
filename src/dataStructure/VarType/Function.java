package dataStructure.VarType;

import dataStructure.basicFinal;

import java.util.ArrayList;

public class Function extends VarType {
    String name;
    int type;
    ArrayList<Integer> paramsType = new ArrayList<>();

    public Function(String name, int type, String[] paramsType) {
        super();
        this.name = name;
        this.type = type;
        setParamsType(paramsType);
    }

    public Function(String name, int type) {
        super();
        this.name = name;
        this.type = type;
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
        return paramsType.size();
    }

    public ArrayList<Integer> getParamsType() {
        return paramsType;
    }

    public void setParamsType(String[] paramsType) {
        if (paramsType != null)
            for (String s : paramsType) {
                this.paramsType.add(basicFinal.getIntTypeByString(s));
            }
    }


}
