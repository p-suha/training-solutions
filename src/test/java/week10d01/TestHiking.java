package week10d01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHiking {

    @Test
    void hikingTest() {

        Hiking hiking = new Hiking(Arrays.asList(10.0, 11.0, 15.0, 10.0, 12.0));

        assertEquals(7.0, hiking.getPlusElevation());
    }
}
