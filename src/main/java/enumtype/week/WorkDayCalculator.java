package enumtype.week;

import java.util.ArrayList;
import java.util.List;

public class WorkDayCalculator {


    private Day nextDay(Day day) {

        if(day.ordinal() == Day.values().length - 1) {
            return Day.values()[0];
        } else {
            return Day.values()[day.ordinal() +1];
        }
    }


    public List<DayType> dayTypes(Day firstDay, int numberOfDays) {

        List<DayType> types = new ArrayList<>();

        Day start = firstDay;

        for(int i = 0; i < numberOfDays; i++) {
            types.add(start.getType());

            start = nextDay(start);
        }

    return types;
    }
}
