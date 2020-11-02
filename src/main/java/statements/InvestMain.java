package statements;

import java.util.Scanner;

public class InvestMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("A befektetés összege: ");
        int befektetes = scan.nextInt();

        System.out.println("A kamat: ");
        int kamat = scan.nextInt();


        Investment investment = new Investment(befektetes, kamat);


        System.out.println("A befektetés összege: " + investment.getFund());

        System.out.println("A hozam 50 napra: " + investment.getYield(50));

        System.out.println("A kivett összeg 80 nap után: " + investment.close(80));
        System.out.println("Kivett összeg 90 nap után: " +investment.close(90));

    }
}
