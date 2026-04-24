import java.util.Scanner;

public class Factorial {
    private final FactorialEngine engine;

    public Factorial(FactorialEngine engine) {
        this.engine = engine;
    }

    public void run() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        while (!scan.hasNextInt()) {
            System.out.println("Enter a valid number");
            scan.next();
        }
        int number = 0;
        try {
            number = scan.nextInt();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("The factorial of " + number + " is " + engine.calculate(number));
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial(new FactorialEngine());
        factorial.run();
    }
}
