package week04d02;

import java.util.ArrayList;
import java.util.List;

public class Search {

    public List<Integer> getIndexesOfChar(String text, char letter) {

        List<Integer> letterIndexes = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == letter) {
                letterIndexes.add(i);
            }
        }
        return letterIndexes;
    }

    public static void main(String[] args) {
        Search s = new Search();


        System.out.println(s.getIndexesOfChar("almafa", 'a'));
    }
}
