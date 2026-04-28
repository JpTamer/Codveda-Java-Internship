public class Deposit implements Transaction {
    private final double amount;

    public Deposit(double amount) {
        this.amount = amount;
    }
    public void execute(BankAccount bankAccount){
        bankAccount.setBalance(bankAccount.getBalance() + amount);
    }
}
