package array;

public class ArrayMain<powersOfTwo> {

    public static void main(String[] args) {


        String[] napok = {"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};

        System.out.println("Kiíratás foreach");

        for (String item : napok) {

            System.out.println(item);
        }

        System.out.println("kiíratás for");

        for (int i = 0; i < napok.length; i++) {

            System.out.println(napok[i]);
        }


        // kettő hatványai

        int[] hatv = new int[5];
        hatv[0] = 1;

        for (int i = 1; i < hatv.length; i++) {
            hatv[i] = hatv[i - 1] * 2;

        }

        for (int hatvany : hatv) {
            System.out.print(hatvany + " ");
        }

        /////boolean felváltva
        System.out.println();
        boolean[] igaze = new boolean[6];

        for (int i = 0; i < igaze.length; i++) {

            if (i % 2 != 0) {
                igaze[i] = true;
            }

        }

        for (boolean ertek : igaze) {
            System.out.println(ertek);
        }

    }


}
