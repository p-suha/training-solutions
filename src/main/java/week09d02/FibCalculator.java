package week09d02;

public class FibCalculator {

    long sumEvens(int bound) {

        long num = 0;

        long first = 0;
        long second = 1;
        long sum = 0;
        while (num < bound) {

            long next = first + second;

            first = second;
            second = next;
            num = next;

            if (num % 2 == 0) {

                sum += num;
            }

        }

        return sum;
    }


}
