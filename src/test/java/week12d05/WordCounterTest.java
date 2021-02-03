package week12d05;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class WordCounterTest {

    @Test
    void wordCounter() {
        WordCounter woc = new WordCounter();
        Path file = Path.of("src/main/resources/index.html");
        int counter = woc.wordCounter("koronavírus");
        assertEquals(11, counter);
    }


}