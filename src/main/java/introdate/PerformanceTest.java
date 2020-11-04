package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {
    public static void main(String[] args) {

        Performance performance = new Performance("Queen", LocalDate.of(1980,06,02), LocalTime.of(10, 00), LocalTime.of(12,00));

        System.out.println(performance.getInfo());
    }
}
