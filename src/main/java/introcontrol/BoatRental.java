package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a létszámot:");

        int erkezoVendegek = scanner.nextInt();

        int csonakokSzama = 3;
        int ferohely = 10;

        if (erkezoVendegek > 3) {
            System.out.println("kiadva: 5 személyes csónak");
            erkezoVendegek -= 5;
            ferohely -= 5;
            csonakokSzama -= 1;
        }

        if(erkezoVendegek > 2) {
            System.out.println("kiadva: 3 személyes csónak");
            erkezoVendegek -= 3;
            ferohely -= 3;
            csonakokSzama -= 1;
        }

        if(erkezoVendegek > 0) {
            System.out.println("kiadva: 2 személyes csónak");
            erkezoVendegek -=2;
            ferohely -= 2;
            csonakokSzama -= 1;
        }

        if(erkezoVendegek > 0) {
            System.out.println("A parton maradt: " + erkezoVendegek + "ember");
        }

        else {
            System.out.println("Szabad csónak: " + csonakokSzama);
            System.out.println("Szabad férőhely: " + ferohely);
        }
    }
}
