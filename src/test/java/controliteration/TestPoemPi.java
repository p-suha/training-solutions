package controliteration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPoemPi {

    @Test

    void testPoemPi() {

        PoemPi piPi = new PoemPi();
        assertEquals("3.141592653589793238462643383279", piPi.countPi());
    }
}
