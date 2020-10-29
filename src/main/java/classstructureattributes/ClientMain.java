package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Név: ");
        client.name = scanner.nextLine();

        System.out.println("Születési év: ");
        client.yearOfBirth = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Cím: ");

        client.adress = scanner.nextLine();

        System.out.println(client.name);
        System.out.println(client.yearOfBirth);
        System.out.println(client.adress);
    }

}
