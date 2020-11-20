package algorithmscount.bankaccounts;

import java.util.List;

public class BankAccountConditionCounter {

    public int countWithBalanceGreaterThan(List<BankAccount> accounts, int minBalance) {
        int counter = 0;
        for(BankAccount item: accounts) {
             if(item.getBalance() > minBalance) {

                 counter++;
             }
        }

        return counter;
    }


}
