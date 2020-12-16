package week08d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStringList {

    @Test

    public void testStringList() {

        StringList stl = new StringList();
        List<String> first = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<String> second = new ArrayList<>(Arrays.asList("a", "k", "b", "f"));

        assertEquals("[a, b, c, f, k]", stl.stringListUnion(first, second).toString());
    }
}
