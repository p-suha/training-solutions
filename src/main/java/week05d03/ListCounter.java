package week05d03;

import java.util.Arrays;
import java.util.List;

public class ListCounter {


    public int listCounter(List<String> phrases) {

        int count = 0;

        if (phrases.size() > 0) {
            for (String item : phrases) {

                item = item.toLowerCase();
                if (item.charAt(0) == 'a') {

                    count++;

                }
            }
        }
        return count;
    }


}
