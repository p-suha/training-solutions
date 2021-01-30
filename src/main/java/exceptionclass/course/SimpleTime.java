package exceptionclass.course;

public class SimpleTime {

    private int hour;
    private int minute;


    public SimpleTime(int hour, int minute) {
        setTime(hour, minute);
    }

    public SimpleTime(String timeString) {
        if (timeString == null) {
            throw new InvalidTimeException("Time is null");
        }
        if (timeString.length() != 5 || timeString.charAt(2) != ':') {
            throw new InvalidTimeException("Time is not hh:mm");
        }

        int h;

        try {
            h = Integer.parseInt(timeString.substring(0, 2));
        } catch (NumberFormatException ex) {
            throw new InvalidTimeException("Time is not hh:mm");
        }

        int m;

        try {
            m = Integer.parseInt(timeString.substring(3, 5));
        } catch (NumberFormatException ex) {
            throw new InvalidTimeException("Time is not hh:mm");
        }
        setTime(h, m);
    }


    public void setTime(int hour, int minute) {
        if (hour < 0 || hour > 23) {
            throw new InvalidTimeException("Hour is invalid (0-23)");
        }
        if (minute < 0 || minute > 59) {
            throw new InvalidTimeException("Minute is invalid (0-59)");
        }

        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", this.hour, this.minute);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
}
