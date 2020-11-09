package finalmodifier;

import java.util.Scanner;

public class CircleCalculator {

   public static final double PI = 3.14;

    public double calculatePerimeter(double r) {

        return 2 * r * PI;
    }

    public double calculateArea (double r) {
        return r*r*PI;
    }

    public static void main(String[] args) {

        CircleCalculator circle = new CircleCalculator();

        System.out.println("Kérem a kör sugarát (r): ");
        Scanner scanner = new Scanner(System.in);

        double sugar = scanner.nextDouble();

        System.out.println("A kör kerülete: " + circle.calculatePerimeter(sugar));
        System.out.println("A kör területe: " + circle.calculateArea(sugar));
    }
}
