package exceptionclass.bank;

import java.util.List;

public class Bank {

    private List<Account> bankAccounts;

    public Bank(List<Account> bankAccounts) {
        if (bankAccounts == null) {
            throw new IllegalArgumentException("bankAccounts");
        }
        this.bankAccounts = bankAccounts;
    }

    public void payment(String accountNumber, double amount) throws InvalidBankOperationException {
        Account account = get(accountNumber);
        account.subtract((amount));
    }

    public void deposit(String accountNumber, double amount) throws InvalidBankOperationException {
        Account account = get(accountNumber);
        account.deposit((amount));
    }

    private Account get(String accountNumber) throws InvalidBankOperationException {
        for (Account account : bankAccounts) {
            if (accountNumber.equals(account.getAccountNumber())) {
                return account;
            }
        }
        throw new InvalidBankOperationException((ErrorCode.INVALID_ACCOUNTNUMBER));
    }


}
