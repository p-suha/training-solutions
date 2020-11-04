package introcontrol;

import java.util.Scanner;

public class UserMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Felhasználók listázása");

        System.out.println("2. Felhasználók felvétele");

        System.out.println("Többi: kilépés");

        System.out.println(" Válassz!");
        int elem = scanner.nextInt();

        if (elem == 1) {
            System.out.println("A választott elem: Felhasználók listázása");
        }

        if (elem == 2 ) {
            System.out.println("A választott elem: Felhasználók felvétele");
        }


    }
}
