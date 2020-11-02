package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Kérek egy számot");
        var number = scan.nextInt();

        var oszthato = (number % 3 == 0) ? "Osztható hárommal" : "Nem osztható hárommal";

        System.out.println(oszthato);
    }
}

