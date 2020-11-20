package algorithmsmax.integers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerMaxCalculator {


    public int max(List<Integer> integers) {
        int max = 0;

        for (Integer item : integers) {

            if (item > max) {
                max = item;
            }
        }

        return max;
    }

//    public static void main(String[] args) {
//
//        List <Integer > theList = new ArrayList<>();
//        theList = Arrays.asList(0,4,3,4,5,9, 5);
//
//        IntegerMaxCalculator calculator = new IntegerMaxCalculator();
//
//
//
//        System.out.println(calculator.searchMax(theList));
//    }

}
