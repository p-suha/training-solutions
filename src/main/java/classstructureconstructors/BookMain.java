package classstructureconstructors;

public class BookMain {
    public static void main(String[] args) {

        Book book = new Book("Robert Merle" , "Állati elmék");

        book.register(12345);

        System.out.println("Szerző: " + book.getAuthor());
        System.out.println("Cím: " + book.getTitle());
        System.out.println(("Regisztrációs szám: " + book.getRegNumber()));
    }

}

