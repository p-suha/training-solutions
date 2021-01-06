package exam02;

//Tömbök
//Írj egy olyan metódust az ArraySelector osztályban, mely egy kapott tömbből minden második elemet kiválogat,
// és egy szövegként összerak, szögletes zárójelek között!
//
//A páros megállapítása index szerint működik. Azaz az első, nulla indexű elem páros,
// a második, azaz egyes indexű elem páratlan, stb.
//
//Ha nulla elemű a tömb, akkor üres stringet adjon vissza!

public class ArraySelector {


    public String selectEvens(int[] array) {
        StringBuilder strb = new StringBuilder();

        strb.append("[");

        if (array.length == 0) {

            return "";
        } else {
            for (int i = 0; i < array.length; i++) {
                if (i % 2 == 0) {
                    strb.append(array[i] + ", ");
                }

            }
        }
        String resultString = strb.substring(0, strb.length() - 2) + "]";

        return resultString;
    }


}

