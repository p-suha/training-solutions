package debug.numbers;

import java.util.Arrays;
import java.util.List;

public class NumbersStatistics {

    private List<Integer> numbers;

    public NumbersStatistics (List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int sumPositives() {
        int sum = 0;
        for(int n: numbers) {
            if(n >= 0) {
                sum += n;
            }
        }
        return sum;
    }

    public int minDifferenceBetweenNeighbours() {

        /* EZT Honnan kellett volna tudnom? Mi kerülte el a figyelmem? És ha most outofindex hiba van, akkor nem jó a megoldásom?
         if (numbers.size() < 2) {
            throw new IllegalStateException("Not enough numbers.");
        }
        */
        int minDifference = numbers.get(0) - numbers.get(1) >= 0 ? numbers.get(0) - numbers.get(1) : numbers.get(1) - numbers.get(0);
        for(int i = 0; i < numbers.size() - 1; i++) {
            int actDifference = numbers.get(i) - numbers.get(i + 1);
            if(Math.abs(actDifference)< Math.abs(minDifference)) { // Ezek szerint ez sem jó, mert nem használhatok math.abs-ot? :((
                minDifference = actDifference;
            }
        }
        return minDifference;
    }

    public static void main(String[] args) {

        NumbersStatistics statistics = new NumbersStatistics(Arrays.asList(4, 8, -1, -2, 4, 5, 3));

        System.out.println(statistics.sumPositives());

        NumbersStatistics statistics1 = new NumbersStatistics(Arrays.asList(4, 8, -1, -2, 4, 5, 3));

        System.out.println(statistics1.minDifferenceBetweenNeighbours());

        NumbersStatistics statistics2 = new NumbersStatistics(Arrays.asList(-3, -4));
        System.out.println(statistics2.sumPositives());

        NumbersStatistics statistics3 = new NumbersStatistics(Arrays.asList(1));
        System.out.println(statistics3.minDifferenceBetweenNeighbours());
            }

}
