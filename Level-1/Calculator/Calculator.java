import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public static void main(String[] args) {
        List<Operation> operationList = new ArrayList<>();
        operationList.add(new Multiplication());
        operationList.add(new Subtraction());
        operationList.add(new Division());
        operationList.add(new Addition());
        CalculatorEngine c = new CalculatorEngine(operationList);
        System.out.println(c.process("/",15,1));
    }
}
