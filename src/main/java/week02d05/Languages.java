package week02d05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Languages {

    public static void main(String[] args) {

        List<String> languages = new ArrayList<>(Arrays.asList("java", "python", "javascript"));

        for (int i = 0; i < languages.size(); i++) {

            if (languages.get(i).length() > 5) {
                System.out.println(languages.get(i));
            }
        }
    }
}
