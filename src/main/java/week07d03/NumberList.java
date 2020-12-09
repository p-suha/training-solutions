package week07d03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberList {

    private List<Integer> numbers;


    public boolean isIncreasing(List<Integer> numbers) {

        for (int i = 0; i < numbers.size() - 1; i++) {

            if (numbers.get(i) > numbers.get(i + 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        NumberList nl = new NumberList();
        System.out.println(nl.isIncreasing(new ArrayList<Integer>(Arrays.asList(1, 4, 4, 7, 9))));

    }
}
