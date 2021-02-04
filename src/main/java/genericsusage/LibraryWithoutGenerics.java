package genericsusage;

import java.util.List;

public class LibraryWithoutGenerics {

    public Book getFirstBookWithoutGenerics(List books) {

        if (books == null) {
            throw new NullPointerException("Argument should not be null!");
        }
        if (books.isEmpty()) {
            throw new IllegalArgumentException("Argument should not be empty!");
        }

        Object obj = books.get(0);
        if (!(obj instanceof Book)) {
            throw new ClassCastException("Not a book");
        }

        return (Book) obj;
    }

}

