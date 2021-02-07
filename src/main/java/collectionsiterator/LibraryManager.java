package collectionsiterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LibraryManager {

    private Set<Book> libraryBooks;

    public LibraryManager(Set<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public Book findBookByRegNumber(int regNumber) {

        Book foundedBook;

        Iterator<Book> i = libraryBooks.iterator();

        while (i.hasNext()) {
            foundedBook = i.next();
            if (foundedBook.getRegNumber() == regNumber) {
                return foundedBook;
            }
        }
        throw new MissingBookException("No book found with regnumber: " + regNumber);
    }

    public int removeBookByRegNumber(int regNumber) {
        Book removeBook;

        Iterator<Book> iterator = libraryBooks.iterator();

        while (iterator.hasNext()) {
            removeBook = iterator.next();
            if (removeBook.getRegNumber() == regNumber) {
                iterator.remove();
                return removeBook.getRegNumber();
            }
        }
        throw new MissingBookException("No books found with regnumber: " + regNumber);
    }

    public Set<Book> selectBookByAuthor(String author) {
        Set<Book> booksOfAuthor = new HashSet<>();

        Book foundedBook;

        Iterator<Book> iterator = libraryBooks.iterator();

        while (iterator.hasNext()) {
            foundedBook = iterator.next();
            if (foundedBook.getAuthor().equals(author)) {
                booksOfAuthor.add(foundedBook);
            }
        }
        if (booksOfAuthor.isEmpty()) {
            throw new MissingBookException("No books found by " + author);
        }

        return booksOfAuthor;

    }

    public int libraryBooksCount() {
        return libraryBooks.size();
    }
}
