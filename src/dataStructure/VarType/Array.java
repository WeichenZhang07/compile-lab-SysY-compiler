package dataStructure.VarType;

import dataStructure.basicFinal;
import dataStructure.nodeInStack;
import tools.Calculator;
import tools.RegisterManager;
import tools.llvmCmdBuffer;

import java.util.ArrayList;

public class Array extends VarType {
    private final ArrayList<Integer> dims = new ArrayList<>();
    private ArrayList<Integer> blockSize;
    private final int VarType;
    private int size = 0;

    public Array(int VarType, int... dims) {
        this.VarType = VarType;
        for (int dim : dims) {
            this.dims.add(dim);
        }
        int len = dims.length;
        blockSize = new ArrayList<>(this.dims.subList(1, dims.length));
        blockSize.add(1);
        for (int i = len - 2; i >= 0; i--) {
            blockSize.set(i, blockSize.get(i) * blockSize.get(i + 1));
        }
        size = 1;
        for (int dim : dims) {
            size *= dim;
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


    public int getOffset(ArrayList<Integer> scripts) {
        if (scripts.size() > dims.size()) {
            System.err.println("数组维度超过定义！");
            System.exit(13);
        }
        int result = 0;
        for (int i = 0; i < scripts.size(); i++) {
            result += scripts.get(i) * blockSize.get(i);
        }
        return result * 4;
    }

    public nodeInStack getOffset(RegisterManager reg, llvmCmdBuffer buffer, nodeInStack... nodes) {
        if (nodes.length > dims.size()) {
            System.err.println("数组维度超过定义！");
            System.exit(13);
        }
        nodeInStack constDim, result;
        result = new nodeInStack("0", basicFinal.IS_VAL, basicFinal.I32, true);
        for (int i = 0; i < nodes.length; i++) {
            constDim = new nodeInStack(blockSize.get(i).toString(), basicFinal.IS_NUM, basicFinal.I32, true);
            result = Calculator.BinaryOperation(
                    Calculator.BinaryOperation(constDim, nodes[i], "*", reg, buffer)
                    , result, "+", reg, buffer);
        }
        return Calculator.BinaryOperation(result, new nodeInStack("4", basicFinal.IS_NUM,
                basicFinal.I32, true), "*", reg, buffer);
    }


    public int getSize() {
        return size;
    }

    public String getArrType() {
        return "[ " + size + " x i32 ]";
    }
}
