package week07d04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLab {

    @Test

    public void testMakeOnlyName() {
        Lab lab = new Lab("elso");
        assertEquals("Lab{title='elso', completeAt=null, completed=false}", lab.toString());
    }

    @Test
    public void testMakeWithDate() {
        Lab lab = new Lab("Lab{title='elso', completeAt=2020-10-10, completed=true}", LocalDate.of(2020, 10, 10));
    }

//    @Test
//    public void testComplete() {
//
//        Lab lab = new Lab("elso");
//        assertEquals("Lab{title='elso', completeAt=2020-10-10, completed=true}",lab.complete(LocalDate.of(2020,12, 10)));
//    }

    @Test
    public void testComplete() {

        Lab lab = new Lab("elso");
        lab.complete();
        assertEquals("Lab{title='elso', completeAt=2020-12-10, completed=true}", lab.toString());
    }

    @Test
    public void testCompleteWithDate() {
        Lab lab = new Lab("elso");
        lab.complete(LocalDate.of(2020, 12, 8));
        assertEquals("Lab{title='elso', completeAt=2020-12-08, completed=true}", lab.toString());

    }

}
