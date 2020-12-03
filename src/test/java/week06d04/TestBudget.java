package week06d04;

import org.junit.jupiter.api.Test;
import week6d04.Budget;
import week6d04.Item;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBudget {

    @Test

    public void testItemsByMonth() {

        List<Item> items = new ArrayList<>();
        items.add(new Item(100, 10, "First"));
        items.add(new Item(200, 12, "Second"));
        items.add(new Item(100, 12, "Second-2"));
        items.add(new Item(200, 7, "Third"));
        items.add(new Item(2100, 1, "Fourth"));

        Budget budget = new Budget(items);


        assertEquals(2, budget.getItemsByMonth(12).size());
        assertEquals(1, budget.getItemsByMonth(1).size());
    }
}
