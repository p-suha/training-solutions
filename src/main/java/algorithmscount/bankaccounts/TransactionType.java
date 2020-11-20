package algorithmscount.bankaccounts;

public enum TransactionType {
    DEBIT("debit"), CREDIT("credit");

    private String type;

    TransactionType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
