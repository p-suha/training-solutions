package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        System.out.println("A termék neve: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();


        System.out.println("A termák ára?");
        int ar = scanner.nextInt();

        Product product = new Product(name, ar);

        System.out.println(product.getName() +" "+ product.getPrice());

        product.increasePrice(250);
        System.out.println(product.getPrice());
        product.decreasePrice(500);
        System.out.println(product.getPrice());
    }
}
