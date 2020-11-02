package stringtype;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Felhasználónév:");
        String fn = scan.nextLine();

        System.out.println("Jelszó:");
        String pw1 = scan.nextLine();
        System.out.println("Jelszó újra:");
        String pw2 = scan.nextLine();

        System.out.println("E-mail:");
        String email = scan.nextLine();

        UserValidator validator = new UserValidator();

        System.out.println(validator.isValidUsername(fn) ? "Felhasználónév oké" : "Hibás felhasználónév");
        System.out.println(validator.isValidPassword(pw1, pw2) ? "Jelszó ok" : "Hibás jelszó");
        System.out.println(validator.isValidEmail(email) ? "Email rendben" : "Hibás email");
    }
}
