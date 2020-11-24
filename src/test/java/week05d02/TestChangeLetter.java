package week05d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestChangeLetter {
    @Test
    void testChangeLetter() {

        ChangeLetter chl = new ChangeLetter();

        assertEquals("th*s", chl.changeVowels("this"));
        assertEquals("th*s", chl.changeVowels("thes"));
        assertEquals("th*s", chl.changeVowels("thus"));
        assertEquals("th*s", chl.changeVowels("thas"));
        assertEquals("th*s", chl.changeVowels("thos"));
        assertEquals("thhh", chl.changeVowels("thhh"));
    }
}
