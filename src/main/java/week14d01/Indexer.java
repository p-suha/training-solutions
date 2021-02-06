package week14d01;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Indexer {
    public Map<Character, List<String>> index(List<String> names) {

        Map<Character, List<String>> result = new HashMap<>();

        for (String name : names) {
            char ch = name.charAt(0);
            if (!result.containsKey(ch)) {
                result.put(ch, new ArrayList<>());
            }
            result.get(ch).add(name);
        }
        return result;
    }
}
