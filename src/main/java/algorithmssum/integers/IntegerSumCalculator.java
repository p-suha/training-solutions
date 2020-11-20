package algorithmssum.integers;

import java.util.List;

public class IntegerSumCalculator {

    public int sum(List<Integer> numbers) {

        int sum = 0;

        for (Integer item : numbers) {

            sum += item;
        }
        return sum;
    }

}

