package classstructureattributes;

import java.util.Scanner;

public class musicMain {
    public static void main(String[] args) {

            Song song = new Song();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Előadó: ");
            song.band = scanner.nextLine();

            System.out.println("Cím: ");
            song.title = scanner.nextLine();

            System.out.println("Hossz: ");
            song.lenght = scanner.nextInt();
            scanner.nextLine();

            System.out.println(song.band + " - " + song.title + " - (" + song.lenght + " perc)");

        }


}
