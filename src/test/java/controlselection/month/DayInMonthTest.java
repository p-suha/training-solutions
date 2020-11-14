package controlselection.month;

import enumtype.week.Day;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DayInMonthTest {

    @Test

    public void testDayInMonth() {
        DayInMonth datum = new DayInMonth();

        //
        assertEquals(28, datum.howManyDays("Február", 2021));
        assertEquals(29, datum.howManyDays("Február", 2024));
        assertEquals(29, datum.howManyDays("Február", 2000));
        assertEquals(31, datum.howManyDays("December", 2020));
        assertEquals(30, datum.howManyDays("április", 2020));

       assertThrows(IllegalArgumentException.class, () -> datum.howManyDays("rosszhonap", 2030));

    }
}
