package week04;

public enum MarkType {

    A(5, "excellent"),
    B(4, "very good"),
    C(3, "improvement needed"),
    D(2, "close fail"),
    F(1, "fail");

    private int rating;
    private String descRating;

    MarkType(int rating, String descRating){
        this.rating = rating;
        this.descRating = descRating;}

    public int getRating() {
        return rating;
    }

    public String getDescRating() {
        return descRating;
    }
}
