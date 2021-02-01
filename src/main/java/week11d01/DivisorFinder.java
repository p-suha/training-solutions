package week11d01;

public class DivisorFinder {

    public int findDivisor(int n) {

        int count = 0;
        String number = Integer.toString(n);

        for (int i = 0; i < number.length(); i++) {
            int num = Integer.parseInt(String.valueOf(number.charAt(i)));

            if (n % num == 0) {
                count++;
            }
        }
        return count;
    }


}
