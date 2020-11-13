package controlselection.greetings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingsTest {

    @Test

    void testGreetins() {

        Greetings greetings = new Greetings();


               assertEquals("Jó éjt!", greetings.greetings(2,59));
               assertEquals("Jó reggelt!", greetings.greetings(5,0));
               assertEquals("Jó reggelt!", greetings.greetings(5,1));
        assertEquals("Jó reggelt!", greetings.greetings(5,10));
        assertEquals("Jó reggelt!", greetings.greetings(8,59));
        assertEquals("Jó napot!", greetings.greetings(9,0));
        assertEquals("Jó napot!", greetings.greetings(9,1));
        assertEquals("Jó napot!", greetings.greetings(18,0));
        assertEquals("Jó napot!", greetings.greetings(18,30));
        assertEquals("Jó estét!", greetings.greetings(18,31));
        assertEquals("Jó estét!", greetings.greetings(19,59));
        assertEquals("Jó estét!", greetings.greetings(20,0));
        assertEquals("Jó éjt!", greetings.greetings(20,1));


    }
}
