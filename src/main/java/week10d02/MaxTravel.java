package week10d02;

import java.util.Arrays;
import java.util.List;

public class MaxTravel {


    public int getMaxTravel(List<Integer> numberOfPassengers) {

        int[] station = new int[30];

        for (int item : numberOfPassengers) {
            station[item]++;
        }

        int indexOfMax = 0;
        for (int i = 0; i < station.length; i++) {

            if (station[i] > station[indexOfMax]) {
                indexOfMax = i;
            }
        }
        return indexOfMax;
    }

}
