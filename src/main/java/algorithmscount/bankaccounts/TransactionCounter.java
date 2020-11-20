package algorithmscount.bankaccounts;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TransactionCounter {


    public int countEntryLessThan (List<Transaction> transactions, int value){

        int counter = 0;
        for(Transaction item: transactions) {

            if(item.getAmount() < value) {
                counter++;
            }
        }
        return counter;

    }
}
