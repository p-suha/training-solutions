package attributes.bill;

import java.util.ArrayList;
import java.util.List;

public class Bill {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {

        items.add(item);

    }

    public List<Item> getItems () {
        return items;
    }

    public double calculateTotalPrice () {

        double ossz = 0.0;

        for (Item item:items) {
            ossz = ossz + (item.getPrice() * item.getQuantity());
        }
        return ossz;
    }


}

