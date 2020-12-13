package constructoroverloading.bus;

public class SimpleTime {

    private int hours;
    private int minutes;

    public SimpleTime(SimpleTime time) {
        this.hours = time.getHours();
        this.minutes = time.getMinutes();
    }

    public SimpleTime(int hours) {
        this.hours = hours;
    }

    public SimpleTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public int difference(SimpleTime time) {

        return ((this.hours * 60) + this.minutes) - ((time.hours * 60) + time.minutes);
    }

    public static void main(String[] args) {
        SimpleTime st = new SimpleTime(10, 10);
        SimpleTime st2 = new SimpleTime(11, 0);

        System.out.println(st.difference(st2));
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public String toString() {

        return this.hours + ":" + this.minutes;
    }
}
