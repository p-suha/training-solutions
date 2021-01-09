package week10d05;

import java.util.Arrays;

public class Calculator {

    public int findMinSum(int[] arr) {

        int sum = 0;

        if (arr.length < 5) {
            throw new IllegalArgumentException("Required minimum four elements");
        }
        Arrays.sort(arr);
        for (int i = 0; i < 4; i++) {
            sum += arr[i];
        }


        return sum;
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        int result = calc.findMinSum(new int[]{8, -1, 1, 2, 6, 3, 5, 4});
        System.out.println(result);
    }
}
