package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {

    public static void main(String[] args) {
        new Book();

        System.out.println(new Book());

//        Book emptybook;
//        System.out.println(emptybook);

        Book emptyBook = null;

        System.out.println(emptyBook);


        if(emptyBook == null) {
            System.out.println("Vizsgálat eredménye: emptyBook is null");
        }

        Book book = new Book();
        System.out.println(book);

        book = null;
        System.out.println(book);

        book = new Book();
        System.out.println(book);

        Book anotherBook = new Book();

        System.out.println(book == anotherBook);

        anotherBook = book;
        System.out.println(anotherBook);
        System.out.println(anotherBook == book);

        System.out.println(anotherBook instanceof Book);


        //////
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = book1;
        Book book5 = book1;
        Book book6 = book3;
        Book book7 = null;
        book4 = book5;
        book5 = new Book();
        book6 = null;

        System.out.println("1" + book1);
        System.out.println("2" + book2);
        System.out.println("3" + book3);
        System.out.println("4 -> 1" + book4);
        System.out.println("5 -> 1" + book5);
        System.out.println("6 -> 3" + book6);
        System.out.println("null" + book7);
        System.out.println("4 -> 5" + book4);
        System.out.println("5 new" + book5);
        System.out.println("6 null" + book6);

    Book[] bookok = {new Book(), new Book(), new Book()};

    List<Book> books = Arrays.asList(new Book(), new Book());
    List<Book> books2 = new ArrayList<>();
    books2.add(new Book());
    books2.add(new Book());
    books2.add(new Book());

    }
}
