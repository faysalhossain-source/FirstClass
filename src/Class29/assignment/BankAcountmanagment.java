/*package Class29.assignment;

import java.io.*;
import java.util.*;

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

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

    public abstract void deposit(double amount) throws InvalidAmountException;

    public abstract void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException;

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    @Override
    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance.");
        }
        balance -= amount;
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    @Override
    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance.");
        }
        balance -= amount;
    }

    @Override
    public double calculateInterest() {
        return 0; // No interest for Current Account

    }
}

public class BankAcountmanagement {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        // File I/O: Reading from file
        try (BufferedReader br = new BufferedReader(new FileReader("accounts.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String id = data[0];
                String type = data[1];
                double balance = Double.parseDouble(data[2]);
                double interest = Double.parseDouble(data[3]);

                if (type.equalsIgnoreCase("Savings")) {
                    accounts.add(new SavingsAccount(id, balance, interest));
                } else if (type.equalsIgnoreCase("Checking")) {
                    accounts.add(new CurrentAccount(id, balance));
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        // Example operations
        try {
            BankAccount acc = accounts.get(0);
            acc.deposit(500);
            acc.withdraw(200);
            System.out.println("Account " + acc.getAccountNumber() + " balance: " + acc.getBalance());
            System.out.println("Interest: " + acc.calculateInterest());
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.err.println(e.getMessage());
        }

        // File I/O: Writing to file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("updated_accounts.csv"))) {
            for (BankAccount acc : accounts) {
                bw.write(acc.getAccountNumber() + "," + acc.getBalance());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }
}*/


