package week08d02;

import java.lang.reflect.Array;
import java.util.*;

public class Lottery {


    public boolean isUnique(List<Integer> numbers, int number) {
        for (Integer item : numbers) {
            if (numbers.contains(number)) {
                return false;
            }
        }
        return true;
    }

    private List<Integer> getNnumbers(int interval, int numbers) {

        List<Integer> sorsoltNumbers = new ArrayList<>();
        Random rnd = new Random();
        int theNumber;
        while (sorsoltNumbers.size() < numbers) {

            theNumber = rnd.nextInt(interval) + 1;

            if (isUnique(sorsoltNumbers, theNumber)) {
                sorsoltNumbers.add(theNumber);
            }
        }
        return sorsoltNumbers;
    }

    public static void main(String[] args) {

        Lottery lt = new Lottery();
        System.out.println(lt.getNnumbers(90, 5).toString());
    }
}