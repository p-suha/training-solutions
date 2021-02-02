package week06d04;

import java.util.ArrayList;
import java.util.List;

public class Budget {

    private List<Item> items;

    public Budget(List<Item> items) {
        this.items = items;

    }


    public List<Item> getItemsByMonth(int searchedMonth) {


        List<Item> monthlyItems = new ArrayList<>();
        for (Item it : items) {

            if (it.getMonth() == searchedMonth) {
                monthlyItems.add(it);
            }
        }

        return monthlyItems;
    }


    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item(100, 10, "neve"));

        Budget budget = new Budget(items);

        System.out.println(budget.getItemsByMonth(10));
    }

}
