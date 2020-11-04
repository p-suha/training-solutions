package introcontrol;

import java.util.Scanner;

public class Qualifier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a számot");
        int szam = scanner.nextInt();
        scanner.nextLine();

        if (szam > 100) {
            System.out.println("Nagyobb, mint száz: ("+ szam + ")");
        }
        else {
            System.out.println("Kisebb, vagy egyenlő 100");
        }


    }
}
