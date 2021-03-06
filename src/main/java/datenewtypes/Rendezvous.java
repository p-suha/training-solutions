package datenewtypes;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.regex.Pattern;

public class Rendezvous {

    private LocalTime rTime;

    public Rendezvous(int hour, int min) {
        this.rTime = LocalTime.of(hour, min);
    }

    public Rendezvous(String timeString, String pattern) {
        validatePattern(pattern);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
        try {
            rTime = LocalTime.parse(timeString, dtf);
        } catch (DateTimeParseException ex) {
            throw new IllegalArgumentException("Illegal time string: " + timeString);
        }
    }

    public int countMinutesLeft(LocalTime base) {
        int timeToGo = (int) ChronoUnit.MINUTES.between(base, rTime);

        if (timeToGo < 0) {
            throw new MissedOpportunityException("Too late!");
        }
        return timeToGo;

    }

    public void pushLater(int hour, int min) {
        rTime = rTime.plusHours(hour).plusMinutes(min);

    }

    public void pullEarlier(int hour, int min) {
        rTime = rTime.minusHours(hour).minusMinutes(min);
    }


    public String toString(String pattern) {
        validatePattern(pattern);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return formatter.format(rTime);
    }

    private void validatePattern(String pattern) {
        if (isEmpty(pattern)) {
            throw new IllegalArgumentException("Empty pattern string!");
        }
    }

    private boolean isEmpty(String str) {
        return str == null || "".equals(str.trim());
    }
}

