package collectionslist.collectionsarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lottery {

    private List<Integer> createBallPool(int ballsQuantity) {

        List<Integer> ballPack = new ArrayList<>();

        for (int i = 0; i < ballsQuantity; i++) {
            ballPack.add(i);
        }
        Collections.shuffle(ballPack);
        return ballPack;
    }

    public List<Integer> selectWinningNumbers(int lotteryType, int sizeOfBallPack) throws IllegalArgumentException {

        if (sizeOfBallPack <= lotteryType) {
            throw new IllegalArgumentException("Balls must be more then the winning numbers!");
        }
        List<Integer> ballPools = createBallPool(sizeOfBallPack);
        List<Integer> winningNumbers = ballPools.subList(0, lotteryType);
        Collections.sort(winningNumbers);
        return winningNumbers;
    }
}
