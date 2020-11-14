package controliteration;

public class PoemPi {

    private static final String POEM = "\n,:,,,\nNem \n a régi s durva közelítés,\n" +
            "Mi szótól szóig így kijön\n" +
            "Betűiket számlálva.\n" +
            "Ludolph eredménye már,\n" +
            "Ha itt végezzük húsz jegyen.\n" +
            "De rendre kijő még tíz pontosan,\n" +
            "Azt is bízvást ígérhetem.\n" +
            "\t";

    public String countPi() {

        String piValue = "";
        int counter = 0;

        for (int i = 0; i < POEM.length(); i++) {

            if (Character.isLetter(POEM.charAt(i))) {
                counter++;
            } else {

                if (counter != 0) {
                    piValue += counter;
                }

                if (piValue.length() ==1) {
                    piValue += ".";
                }

                counter = 0;
            }
        }

return piValue;


    }

    public static void main(String[] args) {
        System.out.println(new PoemPi().countPi());
    }

}
