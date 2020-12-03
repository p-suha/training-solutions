package week6d04;

import java.text.DateFormat;
import java.time.LocalDate;

public class Item {

    private int price;
    private int month;
    private String name;

    public Item(int price, int month, String name) {
        if (price < 0) {
            throw new IllegalArgumentException("Price is wrong!");
        }
        this.price = price;
        this.month = month;

        if (name == null || name == "") {
            throw new IllegalArgumentException("Hiányzó név!");
        }

        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public int getMonth() {
        return month;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Item{" +
                "price=" + price +
                ", month=" + month +
                ", name='" + name + '\'' +
                '}';
    }
}
