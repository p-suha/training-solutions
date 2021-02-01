package week11d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisorFinderTest {

    @Test
    void findDivisorTest() {
        assertEquals(1, new DivisorFinder().findDivisor(425));
        assertEquals(3, new DivisorFinder().findDivisor(111));
    }
}