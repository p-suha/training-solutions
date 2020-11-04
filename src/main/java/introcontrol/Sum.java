package introcontrol;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int summa = 0;
        for (int i = 1; i <= 5; i++) {

            System.out.println("Kérem az " + i +". számot!");

            int szam = scanner.nextInt();

            summa = summa + szam;
        }

        System.out.println("A megadott számok összege: " + summa);
    }
}
