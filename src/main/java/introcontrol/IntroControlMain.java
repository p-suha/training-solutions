package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {

        IntroControl introControl = new IntroControl();
        System.out.println("szám (11) vagy a szám - 10, ha tíznél nagyobb");
        System.out.println(introControl.kivonHaNagyobb(11));

        System.out.println("Nulla-e a 20?");
        System.out.println(introControl.describeNumber(20));

        System.out.println("Nulla-e a 0?");
        System.out.println(introControl.describeNumber(0));

        System.out.println("Joe, vagy nem Joe? (Joe)");
        System.out.println(introControl.greetingJoe("Joe"));

        System.out.println("Joe, vagy nem joe? (Jack)");
        System.out.println(introControl.greetingJoe("Jack"));

        System.out.println("Jutalék egymilliótól (100_000");
        System.out.println(introControl.calculateBonus(100_000));

        System.out.println("Jutalék egymilliótól (1_000_000");
        System.out.println(introControl.calculateBonus(1_000_000));

        System.out.println("Jutalék egymilliótól (2_000_000");
        System.out.println(introControl.calculateBonus(2_000_000));

        System.out.println("Számok kiírása 0-tól max-ig (max=5)");
        introControl.printNumbers(5); //bakker, azért nem printlájn, mert az már benne van a metódusban.

        System.out.println("Számok kiírása min-max (10 - 15)");
        introControl.printNumbersBetween(10, 15); //bakker, azért nem printlájn, mert az már benne van a metódusban.

        System.out.println("Számok kiírása növekvő (2 - 6 )");
        introControl.printNumbersBetweenAnyDirection(2, 6);

        System.out.println("Számok kiírása csökkenő (6 - 2)");
        introControl.printNumbersBetweenAnyDirection(6, 2);

        System.out.println("Páratlan pozitív egész Számok kiírása (max: 7)");
        introControl.printOddNumbers(7);

        System.out.println( "Villanyóra 100 -> 200");
        System.out.println(introControl.calculateConsumption(100, 200));

        System.out.println( "Villanyóra 9900 -> 200");
        System.out.println(introControl.calculateConsumption(9900, 200));
    }
}
