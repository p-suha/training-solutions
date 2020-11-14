package controlselection.accents;

import controlselection.accents.WithoutAccents;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WithoutAccentsTest {

    @Test

    void testWithoutAccents() {

        WithoutAccents wa = new WithoutAccents();

        assertEquals('a',wa.convertToWithoutAccents('á'));
        assertEquals('b',wa.convertToWithoutAccents('b'));
        assertEquals('i',wa.convertToWithoutAccents('í'));
        assertEquals('I',wa.convertToWithoutAccents('Í'));
    }
}
