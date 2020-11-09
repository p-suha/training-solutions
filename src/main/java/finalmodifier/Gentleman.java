package finalmodifier;

import java.util.Scanner;

public class Gentleman {

    public static final String MESSAGE_PREFIX = "Hello ";

    public String sayHello(String nev) {

        return MESSAGE_PREFIX + nev;

    }

    public static void main(String[] args) {

        Gentleman gentleman = new Gentleman();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a nevet");
        String nev = scanner.nextLine();

        System.out.println(gentleman.sayHello(nev));

    }
}
