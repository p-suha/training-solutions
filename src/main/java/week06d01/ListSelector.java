package week06d01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSelector {

    public String listSelector(List<String> words) {

        StringBuilder output = new StringBuilder();

        if (words == null) {
            throw new NullPointerException("List can not be null!");
        }

        if (words.isEmpty()) {
            return "";
        }


        output.append("[");

        for (int i = 0; i < words.size(); i += 2) {
            output.append(words.get(i) + ", ");
        }

        output.deleteCharAt(output.lastIndexOf(" "));
        output.deleteCharAt(output.lastIndexOf(","));
        output.append("]");
        return output.toString();
    }

    public static void main(String[] args) {
        ListSelector ls = new ListSelector();
        System.out.println(ls.listSelector(new ArrayList<>(Arrays.asList("elso", "masodik", "harmadik"))));
    }
}

