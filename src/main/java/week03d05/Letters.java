package week03d05;

import java.util.HashSet;
import java.util.Set;

import static java.lang.Character.isLetter;

public class Letters {

    public int uniqueLettersCounter(String word) {

        Set<Character> characterSet = new HashSet<>();
        for (Character ch : characterSet) {
            if (isLetter(ch)) {
                characterSet.add(ch);
            }
        }
        return characterSet.size();
    }

    public static void main(String[] args) {
        Letter l = new Letter();
        int result = l.uniqueLetters("abrak");

        System.out.println(result);
    }
}
