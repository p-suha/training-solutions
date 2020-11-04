package arrays;

import java.util.Arrays;
import java.util.List;


public class ArraysMain {

    //number of days as string
    public String nOdAs () {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);

    }

    // lista - ez a megoldásból van, a tömböknél nem volt szó listáról
    public List<String> daysOfWeek() {
        return Arrays.asList("Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap");
    }


    // szorzotabla stringkent

    public String szorzotablaString (int size) {

        int[][] szorzotabla = new int[size][size];

        for (int i = 0; i < size; i++) {
            for(int j=0; j< size; j++) {
                szorzotabla[i][j] = (i+1)*(j+1);
            }
        }
        return Arrays.deepToString(szorzotabla);
    }

    // Homerseklet - egyenlo v sem

    public boolean sameTempValue (double[] day, double[] anotherDay) {

        return Arrays.equals(day, anotherDay);
    }

    // lottó ellenőrző

    public boolean wonLottery (int[] kihuzott, int[] megtett) {

        Arrays.sort(kihuzott);
        Arrays.sort(megtett);

        return Arrays.equals(kihuzott, megtett);


    }



    // THE MAIN


    public static void main(String[] args) {

        ArraysMain arraysMain = new ArraysMain();

        System.out.println(arraysMain.nOdAs());

        System.out.println(arraysMain.daysOfWeek());

        System.out.println(arraysMain.szorzotablaString(5));

        System.out.println(arraysMain.sameTempValue(new double[] {1,2,3}, new double[]{1,2,3}));
        System.out.println(arraysMain.sameTempValue(new double[] {1,2,3}, new double[]{3, 4, 8}));
        System.out.println("lottóellenőrzés");
        System.out.println(arraysMain.wonLottery(new int[] {1, 2, 3, 4, 5}, new int[]{5, 4, 3, 2, 1}));

        System.out.println(arraysMain.wonLottery(new int []{1, 7, 3, 4,9}, new int[]{5, 4, 3, 2, 1}));


    }

}
