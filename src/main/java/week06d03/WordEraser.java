package week06d03;

import java.util.Scanner;

public class WordEraser {

    public String eraseWord(String words, String word) {

        StringBuilder strb = new StringBuilder(words);
        Scanner sc = new Scanner(words);

        sc.useDelimiter(" ");
        String egyszo;
        while (sc.hasNext()) {
            egyszo = sc.next();
            if (word.equals(egyszo)) {

                strb.delete(strb.indexOf(egyszo), strb.indexOf(egyszo) + egyszo.length() + 1);
            }
        }

        return strb.toString();

    }


    public static void main(String[] args) {

        WordEraser wordEraser = new WordEraser();

        System.out.println(wordEraser.eraseWord("töröl ezt töröl de nem töröl valamit", "töröl"));
    }
}
