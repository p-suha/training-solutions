package finalmodifier;

import java.util.Scanner;

public class CylinderCalculator {

    public double calculateVolume(double r, double m) {
        return (r * r) * CircleCalculator.PI * m;
    }

    public double calculateTerulet(double r, double m) {
        return ((r * m * CircleCalculator.PI) * 2) + ((CircleCalculator.PI * r * r) * 2);
    }


    public static void main(String[] args) {

        CylinderCalculator henger = new CylinderCalculator();

        Scanner scanner = new Scanner(System.in);

        System.out.println("A henger sugara: (r)");
        double sugar = scanner.nextDouble();

        System.out.println("A henger magassága (h)");
        double h = scanner.nextDouble();
        ;

        System.out.println("A térfogat: " + henger.calculateVolume(sugar, h));
        System.out.println("A terület: " + henger.calculateTerulet(sugar, h));

    }

}
