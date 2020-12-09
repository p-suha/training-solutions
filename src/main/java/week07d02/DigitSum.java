package week07d02;

public class DigitSum {


    public int sumOfDigits(int x) {

        int sum = 0;

        while (x != 0) {

            sum += x % 10;
            x = x / 10;
        }
        return sum;
    }


    public static void main(String[] args) {
        DigitSum ds = new DigitSum();
        System.out.println(ds.sumOfDigits(1234567899));
    }
}
