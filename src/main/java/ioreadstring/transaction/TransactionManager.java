package ioreadstring.transaction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TransactionManager {

    private List<BankAccount> accountList = new ArrayList<>();

    public void uploadListFromFile(String filePath) {

        Path accounts = Path.of(filePath);

        try {
            List<String> accountsFromFile = Files.readAllLines(accounts);
            for (String item : accountsFromFile) {
                String temp[] = item.split(";");
                BankAccount bankaccount = new BankAccount(temp[0], temp[1], Integer.parseInt(temp[2]));
                accountList.add(bankaccount);
            }

        } catch (IOException e) {
            throw new IllegalStateException("Can't open file", e);
        }
    }

    public void makeTransactions(String filePath) {

        Path transactions = Path.of(filePath);

        try {
            List<String> transactionsFromFile = Files.readAllLines(Path.of(filePath));

            for (String item : transactionsFromFile) {

                String temp[] = item.split(";");

                for (BankAccount account : accountList) {
                    if (temp[0].equals(account.getAccountNumber())) {
                        account.setBalance(Double.parseDouble(temp[1]));
                    }
                }
            }

        } catch (IOException e) {
            throw new IllegalStateException("Can' open file");
        }
    }

    public List<BankAccount> getAccountList() {
        return accountList;
    }

}
