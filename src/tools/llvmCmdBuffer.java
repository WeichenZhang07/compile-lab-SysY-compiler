package tools;

import java.util.ArrayList;

public class llvmCmdBuffer {
    private final ArrayList<String> allocateBuffer = new ArrayList<>();
    private final ArrayList<String> operateBuffer = new ArrayList<>();

    public void addToAllocateBuffer(String pt) {
        allocateBuffer.add(pt);
    }

    public void addToOperateBuffer(String pt) {
        operateBuffer.add(pt);
    }

    public void putsAllocate() {
        for (String s : allocateBuffer) {
            System.out.println(s);
        }
        allocateBuffer.clear();
    }

    public void putsOperate() {
        for (String s : operateBuffer) {
            System.out.println(s);
        }
        operateBuffer.clear();
    }

    public llvmCmdBuffer() {
    }
}
