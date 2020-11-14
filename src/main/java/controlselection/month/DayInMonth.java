package controlselection.month;

public class DayInMonth {

    public int howManyDays(String month, int year) {

        switch(month.toLowerCase()) {
            case "január":
            case "március":
            case "május":
            case "július":
            case "augusztus":
            case "október":
            case "december":
                return 31;

            case "április":
            case "június":
            case "szeptember":
            case "november":
                return 30;

            case "február":

                /// év osztható néggyel és nem osztható százzal, kivéve, ha osztható 400
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)){
                    return 29;
                }
                else {
                    return 28;
                }
            default:
                throw new IllegalArgumentException("Invalid month: " + month);

        }

    }


    public static void main(String[] args) {
        DayInMonth date = new DayInMonth();

        System.out.println(date.howManyDays("Február", 2300));
    }
}
