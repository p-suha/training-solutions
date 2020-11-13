package controlselection.greetings;

public class Greetings {
    private int ora;
    private int perc;



    public String greetings(int ora, int perc) {

        if (ora < 5 || ora >20 || (ora == 20 && perc > 0) ) {
            return "Jó éjt!";
        } else if (ora < 9) {
            return "Jó reggelt!";
        } else if (ora < 18 ) {
            return "Jó napot!";
        }
        else if (ora == 18 && perc <=30) {
            return "Jó napot!";
        }
        else if( ora == 18 && perc > 30) {
            return "Jó estét!";
        }

        else if (ora == 20 &&perc == 0 ) {
            return "Jó estét!";
        }
        else if (ora < 20 ) {
            return "Jó estét!";
        }

        else {
            return "valami baj van!";
        }
    }


    public int getOra() {
        return ora;
    }

    public int getPerc() {
        return perc;
    }

    public static void main(String[] args) {
        Greetings idopont = new Greetings();

        System.out.println(idopont.greetings(4,30));
        System.out.println();
        System.out.println(new Greetings().greetings(5,0));
        System.out.println(new Greetings().greetings(5,1));
        System.out.println(new Greetings().greetings(8,59));
        System.out.println();
        System.out.println(new Greetings().greetings(9,0));
        System.out.println(new Greetings().greetings(9,1));
        System.out.println(new Greetings().greetings(18,29));
        System.out.println(new Greetings().greetings(18,30));
        System.out.println();
        System.out.println(new Greetings().greetings(18,31));
        System.out.println(new Greetings().greetings(19,59));
        System.out.println(new Greetings().greetings(20,0));
        System.out.println();
        System.out.println(new Greetings().greetings(20,1));
        System.out.println(new Greetings().greetings(23,51));
    }
}
