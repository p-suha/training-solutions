package controlselection.consonant;

public class ToConsonant {

    public static final String MAGANHANGZOK = "aeiouAEIOU";

    public char legyenMassalhangzo (char c){
        if(MAGANHANGZOK.indexOf(c) >= 0) {
            return (char) (c + 1);
        }
        else {
            return c;
        }
    }

}
