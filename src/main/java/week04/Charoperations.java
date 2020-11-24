package week04;

import java.util.ArrayList;
import java.util.List;

public class Charoperations {


    public List<Integer> getPositionOfChar(String base, String part) {

        List<Integer> positions = new ArrayList<>();

        for (int i = 0; i < base.length(); i++) {

            if (Character.toString(base.charAt(i)).equals(part)) {

                positions.add(i);
            }
        }

        return positions;
    }

    public static void main(String[] args) {

        Charoperations charop = new Charoperations();

        System.out.println(charop.getPositionOfChar("alma", "a"));
    }
}
