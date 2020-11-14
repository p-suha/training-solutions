package controlselection.consonant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToConsonantTest {

    @Test
    void legyenMassalhangzoTeszt() {

        ToConsonant consonant = new ToConsonant();

        assertEquals('b', consonant.legyenMassalhangzo('a'));
        assertEquals('c', consonant.legyenMassalhangzo('c'));
        assertEquals('F', consonant.legyenMassalhangzo('E'));


    }
}
