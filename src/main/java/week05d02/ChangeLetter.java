package week05d02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChangeLetter {


    StringBuilder str = new StringBuilder();
    String[] strings = new String[]{"a", "e", "i", "o", "u"};
    private List<String> vowels = Arrays.asList(strings);


    public String changeVowels(String sentence) {
        StringBuilder str = new StringBuilder(sentence);
        for (int i = 0; i < sentence.length(); i++) {

            for (String item : vowels) {

                String character = Character.toString(sentence.charAt(i));
                if (item.equals(character)) {
                    str.replace(i, i + 1, "*");
                }
            }
        }


        return str.toString();
    }

    public static void main(String[] args) {
        ChangeLetter chl = new ChangeLetter();
        System.out.println(chl.changeVowels("this task was finished in one hour"));
    }

}
