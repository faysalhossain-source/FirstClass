package Class29;



class CurrentAccount extends Class29.BankAccount {
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) throws Class29.InvalidAmountException {
        if (amount <= 0) {
            throw new Class29.InvalidAmountException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    @Override
    public void withdraw(double amount) throws Class29.InvalidAmountException, Class29.InsufficientFundsException {
        if (amount <= 0) {
            throw new Class29.InvalidAmountException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new Class29.InsufficientFundsException("Insufficient balance.");
        }
        balance -= amount;
    }

    @Override
    public double calculateInterest() {
        return 0; // No interest for Current Account

    }
}