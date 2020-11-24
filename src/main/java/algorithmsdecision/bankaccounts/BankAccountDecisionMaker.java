package algorithmsdecision.bankaccounts;

import java.util.List;

public class BankAccountDecisionMaker {

    public boolean containsBalanceGreaterThan(List<BankAccount> accountList, int limit) {

        for (BankAccount item : accountList) {
            if (item.getBalance() > limit) {

                return true;
            }

        }

        return false;
    }
}
