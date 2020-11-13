package controlselection.week;

public class DaysOfWeek {




        public String daysOfWeek (String day) {

            switch (day.toLowerCase()) {

                case "hétfő" :
                    return "Hét eleje";

                case "kedd":
                case "szerda":
                case "csütörtök":
                    return "Hét közepe";

                case "péntek":
                    return "Majdnem hétvége";

                case "szombat":
                case "vasárnap" :
                    return "Hétvége!";

                default:
                    throw new IllegalArgumentException("Nincs ilyen nap: " + day);

            }

        }

}
