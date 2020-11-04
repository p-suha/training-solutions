package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class Performance {
    private String name;
    private LocalDate date;
    private LocalTime start;
    private LocalTime end;

    public Performance(String name, LocalDate date, LocalTime start, LocalTime end) {
        this.name = name;
        this.date = date;
        this.start = start;
        this.end = end;
    }

    public String getInfo() {
        return getName() + ": " + getDate() +" " + getStart() + " - " +getEnd();
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getStart() {
        return start;
    }

    public LocalTime getEnd() {
        return end;
    }
}
