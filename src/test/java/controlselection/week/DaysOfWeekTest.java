package controlselection.week;

import enumtype.week.Day;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DaysOfWeekTest {

    @Test

    void testDaysOfWeek () {

        DaysOfWeek days = new DaysOfWeek();

        days.daysOfWeek("Szerda");

        assertEquals("Hét eleje", days.daysOfWeek("hétfő"));
        assertEquals("Hét közepe", days.daysOfWeek("kedd"));
        assertEquals("Hét közepe", days.daysOfWeek("szerda"));
        assertEquals("Hét közepe", days.daysOfWeek("csütörtök"));
        assertEquals("Majdnem hétvége", days.daysOfWeek("péntek"));
        assertEquals("Hétvége!", days.daysOfWeek("szOmBaT"));
        assertEquals("Hétvége!", days.daysOfWeek("Vasárnap"));


    }
}
