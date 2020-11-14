package controlselection.accents;



public class WithoutAccents {

    public char[] withAccents = {'á','é','í','ó', 'ö', 'ő', 'ú', 'ü', 'ű', 'Á', 'É', 'Í', 'Ó', 'Ö','Ő','Ú','Ü', 'Ű'};
    public char[] withoutAccents = {'a', 'e', 'i', 'o', 'o', 'o', 'u', 'u', 'u', 'A', 'E', 'I', 'O','O','O','U','U','U', };

    public char convertToWithoutAccents(char c) {

        for (int i = 0; i < withAccents.length; i++) {

            if (withAccents[i] == (c)) {
                return withoutAccents[i];
            }
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(new WithoutAccents().convertToWithoutAccents('í'));
    }
}