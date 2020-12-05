package week06d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BisciutTest {

    @Test

    public void testBiscuit() {

        assertEquals("Biscuit{type=HT, gramAmount=100}", Biscuit.of(BiscuitType.HT, 100).toString());
    }

    @Test
    public void testFailBiscuit() {

        assertFalse(Biscuit.of(BiscuitType.MESE, 3000).toString().equals("Biscuit{type=MESE, gramAmount=100}"));
    }
}
