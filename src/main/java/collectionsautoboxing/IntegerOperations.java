package collectionsautoboxing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerOperations {

    public List<Integer> createList(int... nums) {

        List<Integer> numbersList = new ArrayList<>();
        for (int numItem : nums) {
            numbersList.add(numItem);

        }
        return numbersList;
    }

    public int sumIntegerList(List<Integer> integersList) {
        int sum = 0;
        for (int intItem : integersList) {
            sum += intItem;
        }
        return sum;
    }

    public int sumIntegerObjects(Integer... integers) {
        int sum = 0;
        for (Integer integer : integers) {
            sum += integer;
        }
        return sum;
    }

}
