package week14d01;


import java.util.*;

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

    public static void main(String[] args) {
        System.out.println(new Indexer().index(Arrays.asList("Odon", "Lujza", "Abraham", "Magdolna", "Maria")));
    }
}
