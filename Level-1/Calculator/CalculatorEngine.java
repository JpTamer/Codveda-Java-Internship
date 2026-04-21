import java.util.List;

public class CalculatorEngine {
    private final List<Operation> ops;

    public CalculatorEngine(List<Operation> ops) {
        this.ops = ops;
    }

    public int process(String symbol, int n1, int n2) {
        for (Operation op : ops){
            if(op.canHandle(symbol)){
                return op.execute(n1,n2);
            }
        }
        throw new IllegalArgumentException("Unknown Operator");
    }
}
