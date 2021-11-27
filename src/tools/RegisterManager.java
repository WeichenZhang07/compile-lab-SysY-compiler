package tools;

public class RegisterManager {
    int temperCode;// to allocate name for temperVar
    int localVarCode;// to allocate name for  localVar
    int blockCode;

    public String allocateVar() {
        int thisCode = localVarCode++;
        return "%l" + thisCode;
    }

    public String allocateTemperSpace() {
        int thisCode = temperCode++;
        return "%t" + thisCode;
    }

    public String allocateBlockSpace() {
        int thisCode = blockCode++;
        return "%b" + thisCode;
    }

    public RegisterManager() {
        temperCode = 1;
        localVarCode = 1;
        blockCode = 1;
    }
}
