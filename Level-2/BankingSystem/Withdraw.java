public class Withdraw implements Transaction {
    private final double amount;

    public Withdraw(double amount) {
        this.amount = amount;
    }

    public void execute(BankAccount bankAccount) {
        double currBalance = bankAccount.getBalance();
        bankAccount.setBalance(currBalance - amount);
    }
}
