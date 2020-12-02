package week06d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestWordEraser {

    @Test
    void wordEraserTest() {
        WordEraser we = new WordEraser();

        assertEquals("ezt de nem valamit", we.eraseWord("töröl ezt töröl de nem töröl valamit", "töröl"));
    }
}
