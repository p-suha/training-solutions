package inheritancemethods.bankaccount;

public class DebitAccount {

    public String accountNumber;
    private long balance;

    private static final double COST = 3.0;
    private static final long MIN_COST = 200;

    public DebitAccount(String accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public final long costOfTransaction(long amount) {

        return (amount / 100) * (long) COST < MIN_COST ? MIN_COST : (amount / 100) * (long) COST;
    }

    public boolean transaction(long amount) {
        long summaTransaction = amount + costOfTransaction(amount);
        if (summaTransaction <= balance) {
            balance -= summaTransaction;
            return true;
        }
        return false;
    }

    public void balanceToZero() {
        balance = 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public static double getCOST() {
        return COST;
    }

    public static long getMinCost() {
        return MIN_COST;
    }
}
