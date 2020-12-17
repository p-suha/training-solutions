package week08d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTrainer {

    @Test

    public void testCanMark() {

        Trainer trainer1 = new Trainer(new BadMood());
        Trainer trainer2 = new Trainer(new GoodMood());

        assertEquals(3, trainer1.giveMark());
        assertEquals(5, trainer2.giveMark());
    }
}
