import java.util.Scanner;

public class BankEngine {
   private final BankAccount bankAccount = new BankAccount();

    public void run() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    1. Withdraw
                    2. Deposit
                    3. Check Balance
                    0. Exit
                    """);
            while (!scan.hasNextDouble()) {
                System.out.println("Enter a valid number!");
                scan.next();
            }
            int choice = scan.nextInt();
            if (choice == 1) {
                double currBalance = bankAccount.getBalance();
                if (currBalance == 0) {
                    System.out.println("You do not have any amount to withdraw");
                    continue;
                }
                System.out.println("Enter the number you want to Withdraw\nCurrent balance is " + currBalance);
                while (!scan.hasNextDouble()) {
                    System.out.println("Enter a valid number");
                    scan.next();
                }
                double withdraw = scan.nextDouble();
                if (withdraw > currBalance) {
                    System.out.println("No enough credits!");
                } else if (withdraw < 0) {
                    System.out.println("Cannot withdraw negative number!");
                } else {
                    executeTransaction(new Withdraw(withdraw));
                    System.out.println("Withdraw successfully");
                }
            } else if (choice == 2) {
                System.out.println("Enter the number you want to Deposit");
                while (!scan.hasNextDouble()) {
                    System.out.println("Enter a valid number");
                    scan.next();
                }
                double deposit = scan.nextDouble();
                executeTransaction(new Deposit(deposit));
                System.out.println("Deposit successfully");
            } else if (choice == 3) {
                System.out.println("Your balance is " + bankAccount.getBalance());
            } else if (choice == 0) {
                System.out.println("System exited successfully");
                return;
            }
        }
    }
    public void executeTransaction(Transaction transaction){
        transaction.execute(this.bankAccount);
    }
}
