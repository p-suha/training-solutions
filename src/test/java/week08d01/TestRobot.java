package week08d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRobot {
    @Test

    public void testRobot() {

        Robot robot = new Robot(0, 0);
        robot.move("FLJB");

        assertEquals("Az új pozíció: (x)0 (y)0", robot.printPosition());
    }
}
