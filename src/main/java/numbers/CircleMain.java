package numbers;

import java.util.Scanner;

public class CircleMain {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int count = 1; count <= 2;   count++) {

            System.out.println("Kérem a(z) " + count + ". kör átmérőjét: ");
            int diameter = scanner.nextInt();

            Circle circle = new Circle(diameter);

            System.out.println("Kerület: " + circle.circlePerimeter());
            System.out.println("Terület: " + circle.circleArea());
            System.out.println();
        }
    }
}
