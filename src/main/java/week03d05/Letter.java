package week03d05;

import java.util.HashSet;
import java.util.Set;

import static java.lang.Character.isLetter;

public class Letter {

    public int uniqueLetters(String word) {
        Set<Character> characters = new HashSet<>();
        for (Character c : word.toLowerCase().toCharArray()) {

            if (isEnglishLetter(c)) {
                characters.add(c);
            }

        }
        return characters.size();
    }

    private boolean isEnglishLetter(char character) {

        return character >= 'a' && character <= 'z';
    }

    public static void main(String[] args) {
        Letter word = new Letter();

        System.out.println(word.uniqueLetters("abrakadabra"));
        System.out.println(word.uniqueLetters("árvíztűrő tükörfúró"));
    }

}
