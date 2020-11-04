package introcontrol;

public class IntroControl {

    private int szam;

    // kivon tizet a számból, ha az nagyobb mint tíz
     public int kivonHaNagyobb (int szam) {

        if (szam <= 10) {
            szam = szam;
        }
        else {
            szam = szam - 10;
        }
    return szam;
    }

    // zeró vagy nem
    public String describeNumber (int szam) {
        String check = "";
        if (szam == 0)  {
             check = "zero";
             }
        else {
            check = "not_zero";
        }

        return check;
    }

    // ha Joe, akkor hello
    public String greetingJoe (String name) {

        if (name.equals("Joe")) {

            return "hello Joe";
        }

        else {
            return "";
        }
    }

    // Értékesítők jutalék - ha több mint 1_000_000

    public int calculateBonus(int szam) {

         if (szam >= 1_000_000) {
            return szam /10;
         }

         else {
              return 0;
         }

    }

    // pozitív egészek kiírása -maximum megadásával

    public void printNumbers (int max) {

         for (int i = 0 ; i <= max; i++) {
            System.out.println(i);
        }
    }

    // pozitív egészek kiírása - minimum és maximum megadásával

    public void printNumbersBetween (int min, int max) {

        for (int i = min ; i <= max; i++) {
            System.out.println(i);
        }
    }

    // pozitív egészek kiíratása -  a és b között. Ha $a nagyobb, csökkenő sorrend

    public void printNumbersBetweenAnyDirection (int a, int b) {

         if (a > b) {
             for (int i = a; i >= b; i--) {
                 System.out.println(i);
             }
         }
             else {
                 for (int i = a ; i <= b ; i++)
                     System.out.println(i);
         }
    }

    // pozití páratlan egészek kiíratása

    public void printOddNumbers (int max) {

         for (int i = 1; i <= max; i++) {

             if (i % 2 != 0) {
                 System.out.println(i + " páratlan");
             }
         }
    }

    //villanyóra

    public int calculateConsumption (int prev, int next) {
         if (prev <= next) {
             return next - prev;
         }

         else {
             return 10_000 - prev + next;
         }
    }
}
