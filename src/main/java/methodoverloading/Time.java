package methodoverloading;

import java.time.LocalTime;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;
    private Time time;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;

    }

    public Time(int hours) {
        this.hours = hours;
    }

    public Time(Time time) {
        this.hours = time.hours;
        this.minutes = time.minutes;
        this.seconds = time.seconds;
    }


    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public Time getTime() {
        return time;
    }

//    public boolean isEqual(Time time) {
//        return timeInSeconds() == time.timeInSeconds();
//    }
//
//    public boolean isEqual(int hours, int minutes, int seconds) {
//        Time time = new Time(hours, minutes, seconds);
//        return isEqual(time);
//    }
//
//    public boolean isEarlier(Time time) {
//        return timeInSeconds() < time.timeInSeconds();
//    }
//
//    public boolean isEarlier(int hours, int minutes, int seconds) {
//        Time time = new Time(hours, minutes, seconds);
//        return isEarlier(time);
//    }
//
//    private int timeInSeconds() {
//        return 3600 * hours + 60 * minutes + seconds;
//    }


    public boolean isEqual(Time time) {
        return timeInSeconds() == time.timeInSeconds();

    }

    public boolean isEqual(int hours, int minutes, int seconds) {

        return LocalTime.of(hours, minutes, seconds).equals(LocalTime.of(this.hours, this.minutes, this.seconds));
    }

    public boolean isEarlier(Time time) {
        return time.timeInSeconds() > timeInSeconds();


    }

    public boolean isEarlier(int hours, int minutes, int seconds) {
        Time t = new Time(hours, minutes, seconds);

        return t.timeInSeconds() > timeInSeconds();
    }


    private int timeInSeconds() {
        return seconds + (60 * minutes) + (3600 * hours);
    }
}
