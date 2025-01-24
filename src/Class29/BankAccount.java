package Class29;

import Class29.InsufficientFundsException;
import Class29.InvalidAmountException;

abstract class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
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