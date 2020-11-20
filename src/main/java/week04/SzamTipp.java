package week04;

import java.util.Scanner;

public class SzamTipp {

    private int gepiTipp;
    private int emberTipp;

    public SzamTipp(int emberTipp) {
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

                System.out.println("A keresett szám NAGYOBB, adj meg újat:");
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
        String uzenet = counter == 7 ? "sajnálom" : "kitaláltad";
        System.out.println(uzenet);
    }


    public static void main(String[] args) {
        SzamTipp szamTipp = new SzamTipp(50);

        szamTipp.jatek();
        System.out.println(szamTipp.getGepiTipp());
    }
}
