package week02d03;

public class Product {

    private String name;
    private String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public boolean areTheyEqual(Product otherProduct) {

        return name.equals(otherProduct.getName());
    }

    public static void main(String[] args) {
        Product pr1 = new Product("elso", "1234");
        Product pr2 = new Product("masodik", "5678");

        System.out.println(pr1.areTheyEqual(pr2));
    }
}

