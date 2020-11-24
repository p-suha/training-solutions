package week04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CharoperationsTest {

    @Test
    void testCharSearch() {

        Charoperations charoperations = new Charoperations();
        List<Integer> theList = Arrays.asList(0, 3);
        Assertions.assertEquals(theList, charoperations.getPositionOfChar("alma", "a"));
    }
}
