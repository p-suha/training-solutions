package algorithmsmax.sales;

import java.util.List;

public class SalespersonWithFurthestAboveTargetSelector {


    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> theList) {
        Salesperson theBest = null;

        for (Salesperson item : theList) {


            if (theBest == null || item.getDifferenceFromTarget() > 0 && item.getDifferenceFromTarget() > theBest.getDifferenceFromTarget()) {

                theBest = item;
            }

        }
        return theBest;
    }
}

