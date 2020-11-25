package week05d3;

import org.junit.jupiter.api.Test;
import week05d03.ListCounter;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListCounterTest {

    @Test
    void listCounterTest() {

        ListCounter lc = new ListCounter();

        assertEquals(2, lc.listCounter(Arrays.asList("alma", "banan", "Alattomos")));
        assertEquals(0, lc.listCounter(Arrays.asList()));
    }
}

