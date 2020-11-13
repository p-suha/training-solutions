package numbers;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String task = "(3 / 2) * 4 + (8 / 3)";
        double result = (3.0/2) * 4.0 + (8 / 3.0);

        System.out.println("Oldd meg az alábbi feladatot (négy tizedesjegyig számolj)!: \n " + task + "=");
        double studentResult = scanner.nextDouble();

        if(Math.abs(result - studentResult)<0.0001) {
            System.out.println("Helyes megoldás!");
        }
        else {
            System.out.println("Hibás megoldás");

        }
    }
}
