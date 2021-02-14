package week15d03;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostFinderTest {

    @Test
    void findPostsFor() {


        Post postA = new Post("Jani", "cím 1", "kontent-1", LocalDate.of(2020, 10, 10));
        Post postB = new Post("Pityu", "cím 2", "kontent-2", LocalDate.of(2020, 11, 10));
        Post postC = new Post("Jani", "cím 3", "kontent-3", LocalDate.of(2023, 7, 10));
        Post postD = new Post("Jani", "cím 4", "kontent-4", LocalDate.of(2020, 1, 10));


        List<Post> posts = List.of(postA, postB, postC, postD);
        PostFinder pf = new PostFinder(posts);


        assertEquals(2, pf.findPostsFor("Jani").size());

    }
}
