package week09d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class TestSantaClaus {

    @Test

    public void testRandomPresentOverTwentyfour() {
        Person p = new Person("Geza", 20);

        p.setPresent();

        assertNotEquals(null, p.getPresent());
        assertNotEquals(Present.TOY, p.getPresent());
    }


    @Test
    void testSantaClaus() {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("lajos", 10));
        persons.add(new Person("odon", 15));
        persons.add(new Person("geza", 33));
        persons.add(new Person("gizi", 18));


        SantaClaus st = new SantaClaus(persons);
        assertEquals(4, persons.size());
    }

}

