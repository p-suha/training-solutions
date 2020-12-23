package week09d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFibCalculator {

    @Test
    public void testFibCalculator() {

        FibCalculator fc = new FibCalculator();

        assertEquals(798, fc.sumEvens(650));
    }
}
