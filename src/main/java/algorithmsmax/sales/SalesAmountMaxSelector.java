package algorithmsmax.sales;

import java.util.List;

public class SalesAmountMaxSelector {

    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> theList) {

        Salesperson theBest = null;

        for (Salesperson item : theList) {
            if (theBest == null || item.getDifferenceFromTarget() > theBest.getDifferenceFromTarget()) {
                theBest = item;
            }

        }
        return theBest;
    }


}
