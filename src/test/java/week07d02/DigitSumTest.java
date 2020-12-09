package week07d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitSumTest {

    @Test

    public void testDigitSum() {

        assertEquals(6, new DigitSum().sumOfDigits(123));
        assertEquals(1, new DigitSum().sumOfDigits(1000));
        assertEquals(9, new DigitSum().sumOfDigits(9));
    }
}
