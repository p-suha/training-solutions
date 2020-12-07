package week07d01;

public class MathAlgorithms {

    public boolean isPrime(int x) {

        if (x < 1) {
            throw new IllegalArgumentException("A szám nem lehet negatív!");
        }

        int counter = 0;
        for (int i = 1; i <= x; i++) {

            if (x % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            return true;
        }

        return false;
    }


    public static void main(String[] args) {
        MathAlgorithms ma = new MathAlgorithms();
        System.out.println(ma.isPrime(993));
    }

}




