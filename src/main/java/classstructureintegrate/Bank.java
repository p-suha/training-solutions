package classstructureintegrate;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Az új számla száma? ");
        String accountNumber = scanner.nextLine();

        System.out.println("Az új számla tulajdonosa? ");
        String owner = scanner.nextLine();

        System.out.println("Az új számla nyitóegyenlege? ");
        int balance = scanner.nextInt();
        scanner.nextLine();

        BankAccount account1 = new BankAccount(accountNumber, owner, balance );

        System.out.println("Az új számla száma? ");
        String accountNumber2 = scanner.nextLine();

        System.out.println("Az új számla tulajdonosa? ");
        String owner2 = scanner.nextLine();


        System.out.println("Az új számla nyitóegyenlege? ");
        int balance2 = scanner.nextInt();

        BankAccount account2 = new BankAccount(accountNumber2, owner2, balance2 );

        System.out.println(account1.getInfo());
        System.out.println(account2.getInfo());

        System.out.println("Mennyit fizet be az első számlára? \n * \"0\" - nincs befizetés ");
        int befizetElsore = scanner.nextInt();
        account1.deposit(befizetElsore);

        System.out.println("Mennyit fizet be a második számlára? \n * \"0\" - nincs befizetés ");
        int befizetMasodikra = scanner.nextInt();
        account2.deposit(befizetMasodikra);

        System.out.println("Mennyit vesz ki az első számláról? \n * \"0\" - nincs pénzkivétel ");
        int kiveszElsorol = scanner.nextInt();
        account1.withdraw(kiveszElsorol);

        System.out.println("Mennyit vesz ki a második számláról? \n * \"0\" - nincs pénzkivétel ");
        int kiveszMasodikrol = scanner.nextInt();
        account2.withdraw(kiveszMasodikrol);

        System.out.println("Mennyit utal az első számláról a másodikra? \n * \"0\" - nincs átutalás ");
        int utalElsorol = scanner.nextInt();
        account1.transfer(account2, utalElsorol);

        System.out.println("Mennyit utal a második számláról az elsőre? \n * \"0\" - nincs átutalás ");
        int utalMasodikrol = scanner.nextInt();
        account2.transfer(account1, utalMasodikrol );


        System.out.println("A tranzakció(k) eredménye:");
        System.out.println(account1.getInfo());
        System.out.println(account2.getInfo());
    }
}
