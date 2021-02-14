package week15d03;


import java.time.LocalDate;

public class Post {
    private String owner;
    private String content;
    private String title;
    private LocalDate publishedAt;

    public Post(String owner, String title, String content, LocalDate publishedAt) {
        this.owner = owner;
        this.content = content;
        this.title = title;
        this.publishedAt = publishedAt;
    }

    public String getOwner() {
        return owner;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getPublishedAt() {
        return publishedAt;
    }
}
