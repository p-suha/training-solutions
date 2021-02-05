package collectionslist.collectionslinkedlist;

import java.util.*;

public class Draw {
    private List<Integer> createNumberPool(int ballsQuantity) {

        List<Integer> ballPack = new LinkedList<>();

        for (int i = 1; i < ballsQuantity; i++) {
            ballPack.add(i);
        }
        Collections.shuffle(ballPack);
        return ballPack;
    }

    public Set<Integer> drawNumbers(int drawCount, int maxNumber) throws IllegalArgumentException {

        if (maxNumber <= drawCount) {
            throw new IllegalArgumentException("drawCount must be less then " + maxNumber + "!");
        }
        return new TreeSet<>(createNumberPool(maxNumber));
    }
}
