package week04d03;

import java.util.Scanner;

public class GuessTheNumber {


    private int gepiTipp;
    private int emberTipp;

    public GuessTheNumber() {
        this.gepiTipp = (int) (Math.random() * 100) + 1;
        this.emberTipp = emberTipp;
    }

    public int getGepiTipp() {
        return gepiTipp;
    }

    public int getEmberTipp() {
        return emberTipp;
    }


    public void jatek() {

        Scanner scanner = new Scanner(System.in);
        int tipp = getEmberTipp();
        int geptippje = getGepiTipp();
        int counter = 1;
        while (tipp != geptippje && counter <= 6) {

            if (getGepiTipp() > tipp) {
                if (counter == 1) {
                    System.out.println("Kérek egy számot");
                } else {

                    System.out.println("A keresett szám NAGYOBB, adj meg újat:");
                }
                tipp = scanner.nextInt();
                scanner.nextLine();
                counter++;

            } else if (getGepiTipp() < tipp) {

                System.out.println("A keresett szám KISEBB, adj meg újat:");
                tipp = scanner.nextInt();
                scanner.nextLine();

                counter++;
            }
        }
        String uzenet = counter == 7 ? "sajnálom, a(z) \n" + getGepiTipp() + " volt a keresett szám" : "kitaláltad";
        System.out.println(uzenet);
    }


    public static void main(String[] args) {
        GuessTheNumber uj = new GuessTheNumber();

        uj.jatek();

    }
}






