package enumtype.week;

public class WorkDayCalculatorMain {

    public static void main(String[] args) {
        WorkDayCalculator calculator = new WorkDayCalculator();


        System.out.println(calculator.dayTypes(Day.SATURDAY, 7));
    }
}
