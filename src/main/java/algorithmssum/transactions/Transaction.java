package algorithmssum.transactions;

public class Transaction {


    private String accountNumber;
    private TransactionOperation transactionOperation;
    private int amount;

    public Transaction(String accountNumber, TransactionOperation transactionOperation, int amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.transactionOperation = transactionOperation;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getAmount() {
        return amount;
    }

    public TransactionOperation getTransactionOperation() {
        return transactionOperation;
    }

    public boolean isDebit() {
        return transactionOperation == TransactionOperation.DEBIT;
    }


    public boolean isCredit() {
        return transactionOperation == TransactionOperation.CREDIT;
    }
}
