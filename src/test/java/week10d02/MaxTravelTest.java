package week10d02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MaxTravelTest {

    @Test
    void getMaxTravel() {

        assertEquals(4, new MaxTravel().getMaxTravel(Arrays.asList(10, 10, 3, 4, 4, 4, 2, 2)));
    }
}