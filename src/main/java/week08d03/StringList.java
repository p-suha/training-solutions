package week08d03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringList {


    public List<String> stringListUnion(List<String> first, List<String> second) {
        List<String> unio = new ArrayList<>();

        unio.addAll(first);
        for (String secondListItem : second) {
            if (!unio.contains(secondListItem)) {
                unio.add(secondListItem);
            }
        }

        Collections.sort(unio);
        return unio;
    }

}
