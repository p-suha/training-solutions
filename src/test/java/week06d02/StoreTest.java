package week06d02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class StoreTest {

    private Store store = new Store(new ArrayList<>());
    private Product products;


    @BeforeEach

    public void setUp() {

        List<Product> products = new ArrayList<Product>();

        Product pr1 = new Product("Tartós tej", ProductCategory.DAIRY, 100);
        Product pr2 = new Product("Félzsíros tehéntúró", ProductCategory.DAIRY, 500);
        Product pr3 = new Product("Tejföl", ProductCategory.DAIRY, 200);
        Product pr4 = new Product("Zsömle", ProductCategory.BAKEDGOODS, 30);
        Product pr5 = new Product("Kifli", ProductCategory.BAKEDGOODS, 30);
        Product pr6 = new Product("Szalámi", ProductCategory.OTHER, 1030);
        Product pr7 = new Product("Brokkoli", ProductCategory.FROZEN, 1030);
        products.add(pr1);
        products.add(pr2);
        products.add(pr3);
        products.add(pr4);
        products.add(pr5);
        products.add(pr6);
        products.add(pr7);

        Store store = new Store(products);


    }


    @Test

    public void testGetByName() {

        //      List<Product> products = new ArrayList<Product>();

//        Product pr1 = new Product("Tartós tej", ProductCategory.DAIRY, 100);
//        Product pr2 = new Product("Félzsíros tehéntúró", ProductCategory.DAIRY, 500);
//        Product pr3 = new Product("Tejföl", ProductCategory.DAIRY, 200);
//        Product pr4 = new Product("Zsömle", ProductCategory.BAKEDGOODS, 30);
//        Product pr5 = new Product("Kifli", ProductCategory.BAKEDGOODS, 30);
//        Product pr6 = new Product("Szalámi", ProductCategory.OTHER, 1030);
//        Product pr7 = new Product("Brokkoli", ProductCategory.FROZEN, 1030);
//        products.add(pr1);
//        products.add(pr2);
//        products.add(pr3);
//        products.add(pr4);
//        products.add(pr5);
//        products.add(pr6);
//        products.add(pr7);
//
//        Store store = new Store(products);

        Assertions.assertEquals(3, store.getProductByCategoryName(ProductCategory.DAIRY));
        Assertions.assertEquals(1, store.getProductByCategoryName(ProductCategory.OTHER));
    }


}
