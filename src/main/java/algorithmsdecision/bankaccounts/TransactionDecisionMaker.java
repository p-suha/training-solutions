package algorithmsdecision.bankaccounts;

import java.time.LocalDateTime;
import java.util.List;

public class TransactionDecisionMaker {

    public boolean containsCreditEntryGreaterThan(List<Transaction> transactions, LocalDateTime start, LocalDateTime end, int min_amount) {

        for (Transaction item : transactions) {

            if (item.isDebit() && item.getDateOfTransaction().isAfter(start) && item.getDateOfTransaction().isBefore(end) && item.getAmount() > min_amount) {
                return true;
            }

        }
        return false;
    }
}
