import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GuessingEngine engine = new GuessingEngine(new RandomNbGenerator(), 1, 100, 5);

        while (engine.getAttempts() > 0) {
            System.out.println("Try to Guess a Number between 1 and 99 with " + engine.getAttempts() + (engine.getAttempts() < 2 ? " attempt" : " attempts"));
            int guess;
            if (scan.hasNextInt()) {
                guess = scan.nextInt();
            } else {
                System.out.println("Invalid Number");
                scan.next();
                continue;
            }
            String result = engine.guessStatus(guess);
            if (result.equals("Correct")) {
                System.out.println("Congratulation! you won with " + (5 - engine.getAttempts() + 1) + " attempts");
                System.exit(1);
            } else if (result.equals("Low")) {
                System.out.println("Too low");
            } else {
                System.out.println("Too high");
            }
        }
        System.out.println("Sorry you've lost, Try again later");
    }
}
