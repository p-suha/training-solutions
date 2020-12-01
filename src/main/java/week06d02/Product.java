package week06d02;

public class Product {

    private String name;
    private ProductCategory cat;
    private int price;


    public Product(String name, ProductCategory cat, int price) {
        this.name = name;
        this.cat = cat;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public ProductCategory getCat() {
        return cat;
    }

    public int getPrice() {
        return price;
    }
}
