package dataStructure.VarType;

import java.util.ArrayList;

public class Array extends VarType {
    private final ArrayList<Integer> dims = new ArrayList<>();
    private final int VarType;

    public Array(int VarType, int... dims) {
        this.VarType = VarType;
        for (int dim : dims) {
            this.dims.add(dim);
        }
    }

    public int getDim() {
        return dims.size();
    }

    public ArrayList<Integer> getDims() {
        return dims;
    }

    public int getVarType() {
        return this.VarType;
    }
}
