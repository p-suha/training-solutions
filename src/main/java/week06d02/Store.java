package week06d02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store {
    private List<Product> products;

    public Store(List<Product> products) {
        this.products = products;
    }

    public int getProductByCategoryName(ProductCategory category) {

        int count = 0;
        for (Product item : products) {
            if (item.getCat().equals(category)) {
                count++;
            }

        }
        return count;
    }


    public static void main(String[] args) {

        Product pr1 = new Product("Tartós tej", ProductCategory.DAIRY, 100);
        Product pr2 = new Product("Félzsíros tehéntúró", ProductCategory.DAIRY, 500);
        Product pr3 = new Product("Tejföl", ProductCategory.DAIRY, 200);
        Product pr4 = new Product("Zsömle", ProductCategory.BAKEDGOODS, 30);
        Product pr5 = new Product("Kifli", ProductCategory.BAKEDGOODS, 30);
        Product pr6 = new Product("Szalámi", ProductCategory.OTHER, 1030);
        Product pr7 = new Product("Brokkoli", ProductCategory.FROZEN, 1030);

        List<Product> products = new ArrayList<>();
        products.add(pr1);
        products.add(pr2);
        products.add(pr3);
        products.add(pr4);
        products.add(pr5);
        products.add(pr6);
        products.add(pr7);


        Store store = new Store(products);

        System.out.println(store.getProductByCategoryName(ProductCategory.BAKEDGOODS));
    }
}
