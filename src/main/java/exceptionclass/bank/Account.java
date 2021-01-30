package exceptionclass.bank;

public class Account {
    private String accountNumber;
    private double balance;
    private double maxSubtract;

    public Account(String accountNumber, double balance) {

        if (accountNumber == null) {
            throw new IllegalArgumentException();
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.maxSubtract = 100_000;
    }

    public double subtract(double amount) throws InvalidBankOperationException {
        if (amount > this.maxSubtract || amount < 0) {
            throw new InvalidBankOperationException(ErrorCode.INVALID_AMOUNT);
        }
        double newBalance = this.balance - amount;

        if (newBalance < 0) {
            throw new InvalidBankOperationException(ErrorCode.LOW_BALANCE);
        }
        return this.balance = newBalance;
    }

    public double deposit(double amount) throws InvalidBankOperationException {
        if (amount <= 0) {
            throw new InvalidBankOperationException(ErrorCode.INVALID_AMOUNT);
        }
        double newBalance = this.balance + amount;
        return this.balance = newBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }

    public void setMaxSubtract(double maxSubstract) throws InvalidBankOperationException {
        if (maxSubstract < 0) {
            throw new InvalidBankOperationException((ErrorCode.INVALID_AMOUNT));
        }
        this.maxSubtract = maxSubstract;
    }
}
