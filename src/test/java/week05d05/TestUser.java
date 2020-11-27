package week05d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestUser {

    @Test

    public void testMakeUserWithoutDot() {


        Exception ex = assertThrows(IllegalArgumentException.class, () -> new User("Kovács", "István", "valamiami@nincspont"));
        assertEquals("Not valid email!", ex.getMessage());
    }

    @Test
    void testMakeUserWithoutAt() {


        Exception ex = assertThrows(IllegalArgumentException.class, () -> new User("Kovács", "István", "valamiaminincskukac.pont"));
        assertEquals("Not valid email!", ex.getMessage());
    }

    @Test
    void testMakeUserWithBadPlaceDot() {


        Exception ex = assertThrows(IllegalArgumentException.class, () -> new User("Kovács", "István", "valamiami.nincskukac@pont"));
        assertEquals("Not valid email!", ex.getMessage());
    }

    @Test

    public void testgetFullName() {

        User user = new User("Kovács", "János", "valami@akarmi.hu");

        assertEquals("Kovács János", user.getFullName());
    }
}
