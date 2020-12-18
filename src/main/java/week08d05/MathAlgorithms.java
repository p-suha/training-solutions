package week08d05;

import java.util.ArrayList;
import java.util.List;

public class MathAlgorithms {

    public int greatestCommonDivisor(int x, int y) {

        int greatestDivisor = 0;

        for (int i = 1; i < y; i++) {

            if (x % i == 0 && y % i == 0) {
                greatestDivisor = i;
            }
        }
        return greatestDivisor;
    }


}
