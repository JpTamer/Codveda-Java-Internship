public class Division implements Operation{
    @Override
    public int execute(int n1, int n2) {
        if(n2 == 0) throw new ArithmeticException("Divide by 0");
        return n1/n2;
    }

    @Override
    public boolean canHandle(String symbol) {
        return symbol.equals("/");
    }
}
