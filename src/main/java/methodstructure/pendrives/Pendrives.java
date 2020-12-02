package methodstructure.pendrives;

import java.util.ArrayList;
import java.util.List;

public class Pendrives {

    private List<Pendrive> pendrivesList = new ArrayList<>();

    public Pendrive best(List<Pendrive> pendrivesList) {
        Pendrive theCheapest = null;
        for (int i = 0; i < pendrivesList.size() - 1; i++) {
            if (pendrivesList.get(i).cheaperThan(pendrivesList.get(i + 1)))
                theCheapest = pendrivesList.get(i + 1);
        }
        return theCheapest;
    }

    public void risePriceWhereCapacity(List<Pendrive> pendrivesList, int percent, int capacity) {

        for (Pendrive item : pendrivesList) {
            if (item.getCapacity() == capacity) {
                item.risePrice(percent);
            }

        }

    }

    public Pendrive cheapest(List<Pendrive> pendrivesList) {
        Pendrive theCheapest = null;
        for (int i = 0; i < pendrivesList.size() - 1; i++) {

            if (pendrivesList.get(i).cheaperThan(pendrivesList.get(i + 1))) {

                theCheapest = pendrivesList.get(i);
            }
        }
        return theCheapest;

    }

}
