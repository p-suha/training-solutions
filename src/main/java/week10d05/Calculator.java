package week10d05;

import java.util.Arrays;

public class Calculator {

    public int findMinSum(int[] arr) {

        int sum = 0;

        if (arr.length < 4) {
            throw new IllegalArgumentException("Required minimum four elements");
        }
        Arrays.sort(arr);
        for (int i = 0; i < 4; i++) {
            sum += arr[i];
        }


        return sum;
    }

}
