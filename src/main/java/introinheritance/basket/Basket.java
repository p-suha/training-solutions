package introinheritance.basket;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Item> items = new ArrayList<>();


    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(String barcode) {
        Item toBeRemove = null;

        for (Item i : items) {
            if (i.getBarcode().equals(barcode)) {
                toBeRemove = i;
            }
        }
        items.remove(toBeRemove);
    }

    public void clearBasket() {
        items.clear();
    }

    public List<Item> getItems() {
        return new ArrayList<>(items);
    }
}
