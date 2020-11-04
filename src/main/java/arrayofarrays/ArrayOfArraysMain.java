package arrayofarrays;

public class ArrayOfArraysMain {

    public void printArrayOfArrays(int[][] a ) {

        for(int i[] : a) {

            for (int j : i) {

                if (j < 10) {
                    System.out.print(" ");
                }

                if (j < 100) {
                    System.out.print(" ");
                }
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    public int[][] multiplicationTable(int size) {

        int[][] multiplicationTable = new int[size][size];
        for (int i = 0; i < size; i++) {
            for(int j = 0 ; j < size ; j++) {
                multiplicationTable[i][j] = (i +1 ) * (j + 1);
            }

        }
        return multiplicationTable;
    }


    public int[][] tringularMatrix(int size) {

        int[][]  tomb = new int[size][];

        for(int i = 0; i < tomb.length; i++ ) {
               tomb[i] = new int [i + 1];
                for(int j = 0 ; j < i+1; j++) {
                    tomb[i][j] = i+1;
                }
            }
        return tomb;
        }

        //hónapok-napok

    public int[][] getValues() {
        int values[][] = new int[12][];
        int[] napokSzama = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0 ; i < napokSzama.length; i++) {

            values[i] = new int [napokSzama[i]];
        }
        return values;
    }

    // A main

    public static void main(String[] args) {
        ArrayOfArraysMain arrayOfArraysMain = new ArrayOfArraysMain();

        System.out.println("Multiplication table");
        arrayOfArraysMain.printArrayOfArrays(arrayOfArraysMain.multiplicationTable(3));

        System.out.println("Tringularmatrix");
        arrayOfArraysMain.printArrayOfArrays(arrayOfArraysMain.tringularMatrix(5));

        System.out.println("Values per days");
        arrayOfArraysMain.printArrayOfArrays(arrayOfArraysMain.getValues());
    }

}