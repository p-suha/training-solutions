package algorithmsdecision.bankaccounts;

import java.time.LocalDateTime;

public class Transaction {

    private String accountNumber;
    private TransactionOperation transactionOperation;
    private int amount;
    private LocalDateTime dateOfTransaction;
    private TransactionStatus status;

    public Transaction(String accountNumber, TransactionOperation transactionOperation, int amount, LocalDateTime dateOfTransaction) {
        this.accountNumber = accountNumber;
        this.transactionOperation = transactionOperation;
        this.amount = amount;
        this.dateOfTransaction = dateOfTransaction;
        status = TransactionStatus.CREATED;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public TransactionOperation getTransactionOperation() {
        return transactionOperation;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDateTime getDateOfTransaction() {
        return dateOfTransaction;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public boolean isDebit() {
        return transactionOperation == TransactionOperation.DEBIT;
    }


    public boolean isCredit() {
        return transactionOperation == TransactionOperation.CREDIT;
    }

    public void setStatusOk() {

        status = TransactionStatus.SUCCEEDED;

    }

    public void setStatusFail() {
        status = TransactionStatus.PENDING;
    }
}
