package week15d03;
//Implementáljunk a PostFinder osztályban egy public List<Post> findPostsFor(String user) metódust az alábbi módon:
//
//        Csak olyan Post-ot adjunk vissza, amelynek az owner-e megegyezik a megadott user-rel
//        A Post publishedAt dátuma korábbi kell, hogy legyen, mint a LocalDate.now()
//        A content és a title nem lehet üres
//        Tároljunk egy List<Post> objektumot a PostFinder osztályban, melyet konstruktor paraméterként kap meg és ezt használjuk!


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PostFinder {
    private List<Post> postsList;

    public PostFinder(List<Post> postsList) {
        this.postsList = postsList;
    }


    public List<Post> findPostsFor(String user) {

        List<Post> result = new ArrayList<>();

        for (Post post : postsList) {

            if (
                    isBeforeAt(post)
                            && isOwnerEquals(post, user)
                            && isTitleNotEmpty(post)
                            && isContentNotEmpty(post)) {
                result.add(post);
            }
        }
        return result;
    }

    private boolean isTitleNotEmpty(Post post) {
        return !post.getTitle().isEmpty();
    }

    private boolean isOwnerEquals(Post post, String user) {
        return post.getOwner().equals(user);
    }

    private boolean isContentNotEmpty(Post post) {
        return !post.getContent().isEmpty();
    }

    private boolean isBeforeAt(Post post) {
        return post.getPublishedAt().isBefore(LocalDate.now());
    }

}


