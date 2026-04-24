public class FactorialEngine implements FactorialCalculator {
    public int calculate(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number should be positive");
        }
        if (number <= 1) return 1;
        return number * calculate(number - 1);
    }
}
