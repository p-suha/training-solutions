package week05d4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> products = new ArrayList<>();

    public Store(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {

        products.add(product);
    }

    public int getNumberOfExpired() {

        int count = 0;

        for (Product item : products) {
            if (item.getExpire().isBefore(LocalDate.now())) {

                count++;
            }
        }
        return count;

    }


}
