package algorithmsdecision.bankaccounts;

import classstructureintegrate.Bank;

import java.util.List;

public class TransactionExecutor {

    public void executeTransactions(List<Transaction> transactions, List<BankAccount> accounts) {
        for (Transaction transaction : transactions) {
            BankAccount accountRelatedToTransaction = findBankAccount(accounts, transaction.getAccountNumber());
            if (accountRelatedToTransaction != null) {
                executeTransaction(transaction, accountRelatedToTransaction);
            } else {
                transaction.setStatusFail();
            }
        }
    }

    private void executeTransaction(Transaction transaction, BankAccount accountRelatedToTransaction) {
        if (transaction.isCredit()) {
            accountRelatedToTransaction.deposit(transaction.getAmount());
            transaction.setStatusOk();
        } else {
            if (accountRelatedToTransaction.withdraw(transaction.getAmount())) {
                transaction.setStatusOk();
            } else {
                transaction.setStatusOk();
            }
        }
    }

    private BankAccount findBankAccount(List<BankAccount> accounts, String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber))
                return account;
        }
        return null;
    }
}

//
//    public BankAccount findBankAccount(List<BankAccount> accounts) {
//
//        for (BankAccount sourceAccount : accounts) {
//
//            if (accounts.contains(sourceAccount)) {
//
//                return sourceAccount;
//            }
//
//        }
//            return null;
//    }
//
//    private void executeTransaction(Transaction transaction, BankAccount sourceAccount) {
//
//        if(transaction.isCredit()) {
//
//            sourceAccount.deposit(transaction.getAmount());
//
//
//        } else {
//            sourceAccount.withdraw(transaction.getAmount());
//        }
//
//    }
//
//
//
//        public void executeTransactions(List<Transaction>transactions, List<BankAccount> accountses) {
//
//        for(Transaction item: transactions) {
//
//            BankAccount theSourceAccount = findBankAccount(accountses);
//
//            if(theSourceAccount != null) {
//
//                executeTransaction(item, theSourceAccount);
//
//                item.setStatusOk();
//            }
//            else {
//                item.setStatusFail();
//            }
//
//        }
//        }
//}
