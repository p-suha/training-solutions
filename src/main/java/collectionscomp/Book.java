package collectionscomp;

public class Book implements Comparable<Book> {

    private int regNUmber;
    private String title;
    private String author;

    public Book(int regNUmber, String title, String author) {
        this.regNUmber = regNUmber;
        this.title = title;
        this.author = author;
    }

    public int getRegNUmber() {
        return regNUmber;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return regNUmber + " " + title + " " + author;
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }
}
