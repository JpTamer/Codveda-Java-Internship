public class Subtraction implements Operation{
    @Override
    public int execute(int n1, int n2) {
        return n1-n2;
    }

    @Override
    public boolean canHandle(String symbol) {
        return symbol.equals("-");
    }
}
