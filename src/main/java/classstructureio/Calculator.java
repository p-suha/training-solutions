package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem az első számot!");
        int numberOne = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kérem a második számot!");
        int numberTwo = scanner.nextInt();
        scanner.nextLine();

        System.out.println( " A művelet: " + numberOne + "+" + numberTwo);
        int summa = numberOne+numberTwo;
        System.out.println("Az eredmény: " + summa);
    }
}
