package week11d03;

import java.util.ArrayList;
import java.util.List;


public class WordFilter {

    public List<String> wordsWithChar(List<String> words, char c) {

        List<String> resultList = new ArrayList<>();
        for (String word : words
        ) {
            if (word.contains(String.valueOf(c))) {
                resultList.add(word);
            }

        }
        return resultList;
    }
}
