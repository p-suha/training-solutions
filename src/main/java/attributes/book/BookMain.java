package attributes.book;

public class BookMain {

    public static void main(String[] args) {
        Book konyv = new Book("Cimet kér paraméterként");
        System.out.println(konyv.getTitle());

        konyv.setTitle("Ez a cim setterrel készült");

        System.out.println(konyv.getTitle());
    }
}
