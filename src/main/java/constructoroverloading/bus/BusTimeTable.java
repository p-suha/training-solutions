package constructoroverloading.bus;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {

    private List<SimpleTime> timetable;
    private int firstHour;
    private int lastHour;
    private int everyMinute;


    public BusTimeTable(int firstHour, int lastHour, int everyMinute) {
        List<SimpleTime> timetable = new ArrayList<>();
        int repeat = lastHour - firstHour;

        for (int i = 0; i <= repeat; i++) {
            SimpleTime t = new SimpleTime(firstHour + i, everyMinute);
            timetable.add(t);
        }
        this.timetable = timetable;

    }

    public BusTimeTable(List<SimpleTime> timetable) {
        this.timetable = timetable;
    }

    public List<SimpleTime> getTimeTable() {

        return timetable;
    }

    public SimpleTime nextBus(SimpleTime actual) {

        for (int i = 0; i < timetable.size(); i++) {
            if (timetable.get(i).difference(actual) >= 0) {
                return timetable.get(i);
            }
        }
        throw new IllegalStateException("No more buses today!");
    }
}
