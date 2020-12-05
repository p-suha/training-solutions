package methodoverloading.pub;

import java.util.ArrayList;
import java.util.List;

public class ListOfGoodPubs {
    private List<Pub> pubList = new ArrayList<>();

    public ListOfGoodPubs(List<Pub> pubList) {

        if (pubList == null || pubList.isEmpty()) {
            throw new IllegalArgumentException("Pub list is empty!");
        }
        this.pubList = pubList;
    }


    public Pub findTheBest() {

        Pub theBest = pubList.get(0);

        for (int i = 0; i < pubList.size(); i++) {

            if (pubList.get(i).getOpenFrom().isEarlier(theBest.getOpenFrom())) {

                theBest = pubList.get(i);
            }
        }
        return theBest;
    }
}
