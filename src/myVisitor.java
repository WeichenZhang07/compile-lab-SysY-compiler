import gen.grammerBaseVisitor;
import gen.grammerParser;
import java.util.HashMap;

public class myVisitor extends grammerBaseVisitor<Integer> {
    static final int IS_NUM = 0, IS_VAR = 1;
    int topVar = 0;
    HashMap<String, Integer> memory = new HashMap<>(); //for declined variables

    protected class expNode {
        int type;
        String context;

        expNode() {
        }

        expNode(int type, String context) {
            this();
            this.context = context;
            this.type = type;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getContext() {
            return context;
        }

        public void setContext(String context) {
            this.context = context;
        }
    }

    @Override
    public Integer visitCompUnit(grammerParser.CompUnitContext ctx) {
        ctx.funcDef();
        return super.visitCompUnit(ctx);
    }
}
