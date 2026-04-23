import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Operation> operationList = new ArrayList<>();

        operationList.add(new Multiplication());
        operationList.add(new Subtraction());
        operationList.add(new Division());
        operationList.add(new Addition());

        CalculatorEngine c = new CalculatorEngine(operationList);

        System.out.println("Enter two numbers to execute: ");
        while (!scan.hasNextInt()) {
            System.out.println("Enter a valid number!");
            scan.next();
        }
        int n1 = scan.nextInt();

        while (!scan.hasNextInt()) {
            System.out.println("Enter a valid second number!");
            scan.next();
        }
        int n2 = scan.nextInt();

        System.out.println("Enter the operator you want to use:('-', '+', '/', '*')");
        String operator = scan.next();

        System.out.println(c.process(operator, n1, n2));
    }
}
