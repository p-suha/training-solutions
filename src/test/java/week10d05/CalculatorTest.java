package week10d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void findMinSumTest() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.findMinSum(new int[]{8, -1, 1, 2, 6, 3, 5, 4}));
    }

    @Test
    void notEnoughElementsTest() {
        Calculator calc = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> {
            calc.findMinSum(new int[]{8, 2});
        });
    }
}