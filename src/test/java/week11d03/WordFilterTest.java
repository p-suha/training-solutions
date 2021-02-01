package week11d03;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordFilterTest {

    @Test
    void testFilter() {
        WordFilter obj = new WordFilter();
        List<String> words = List.of("alma", "narancs", "körte", "barack");
        assertEquals(List.of("körte", "barack"), obj.wordsWithChar(words, 'k'));
    }

}