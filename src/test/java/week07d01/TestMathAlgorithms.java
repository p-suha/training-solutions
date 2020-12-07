package week07d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMathAlgorithms {

    @Test

    public void mathAlgorithmsTest() {

        MathAlgorithms ma = new MathAlgorithms();

        assertTrue(ma.isPrime(997));
        assertFalse(ma.isPrime(9));
        assertFalse(ma.isPrime(1));
    }

    @Test

    public void negativeNumberTest() {

        assertThrows(IllegalArgumentException.class, () -> new MathAlgorithms().isPrime(-300));
    }
}
