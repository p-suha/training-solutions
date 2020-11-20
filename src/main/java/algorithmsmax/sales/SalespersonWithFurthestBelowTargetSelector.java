package algorithmsmax.sales;

import java.util.List;

public class SalespersonWithFurthestBelowTargetSelector {


    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> theList) {

        Salesperson theWorst = null;

        for (Salesperson item : theList) {

            if (theWorst == null || item.getDifferenceFromTarget() < 0 && item.getDifferenceFromTarget() < theWorst.getDifferenceFromTarget()) {

                theWorst = item;
            }
        }


        return theWorst;
    }
}
