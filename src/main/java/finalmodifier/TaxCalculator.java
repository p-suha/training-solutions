package finalmodifier;

import java.util.Scanner;

public class TaxCalculator {

    private static final int TAX = 27;


    public double priceWithTax(double netto) {

        return netto + (netto / 100.0 * 27);
    }

    public double tax(double price) {

        return price / ((TAX/100.0) + 1);
    }

    public static void main(String[] args) {

        TaxCalculator taxCalculator = new TaxCalculator();

        Scanner scanner = new Scanner(System.in);
        System.out.println("A nettó ár: ");

        double netto = scanner.nextDouble();

        System.out.println(taxCalculator.priceWithTax(netto));

        System.out.println("A bruttó ár: ");
        double brutto = scanner.nextDouble();
        System.out.println(taxCalculator.tax(brutto));

    }


    }

