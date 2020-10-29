package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a neved!");

        String name = scanner.nextLine();

        System.out.println("Add meg a jelszót");
        String password = scanner.nextLine();
        System.out.println("Az adataid: \n Név: " + name + "\n Jelszó: " + password);
    }
}
