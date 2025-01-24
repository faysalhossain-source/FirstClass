package Class29;



abstract class SavingAccount {
    protected String accountNumber;
    protected double balance;

    public SavingAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void deposit(double amount) throws Class29.InvalidAmountException;

    public abstract void withdraw(double amount) throws Class29.InvalidAmountException, Class29.InsufficientFundsException;

    public abstract double calculateInterest();
}