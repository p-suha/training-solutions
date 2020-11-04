package array;

public class ArrayHandler {

    public boolean contains(int[] source, int itemToFind) {

        for (int item : source) {
            if (item == itemToFind) {
                return true;
            }
        }
        return false;
    }

    public int find(int[] source, int itemToFind) {
        for (int i = 0; i < source.length; i++) {

            if (source[i] == itemToFind) {
                return i;
            }


        }
        return -1;
    }

    public static void main(String[] args) {

        ArrayHandler arrayHandler = new ArrayHandler();

        int[] teszttomb = new int[]{1, 3, 5, 10};

        System.out.println("Benne van-e a teszttömbben a nyolc?");
        System.out.println(arrayHandler.contains(teszttomb, 8));

        System.out.println("Benne van-e a teszttömbben a 10?");
        System.out.println(arrayHandler.contains(teszttomb, 10));

        System.out.println("Mi a találat indexe? (8)");
        System.out.println(arrayHandler.find(teszttomb, 8));
        System.out.println("Mi a találat indexe? (10)");
        System.out.println(arrayHandler.find(teszttomb,10));

    }
}

