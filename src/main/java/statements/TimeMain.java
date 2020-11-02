package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // első időpont

        System.out.println("Kérem az első időpontot! \n ora:");


        int ora = scan.nextInt();

        System.out.println("perc:");
        int perc = scan.nextInt();

        System.out.println("masodperc:");
                int masodperc = scan.nextInt();


        System.out.println("Kérem a második időpontot! \n ora:");


        int ora2 = scan.nextInt();

        System.out.println("perc:");
        int perc2 = scan.nextInt();

        System.out.println("masodperc:");
        int masodperc2 = scan.nextInt();


        Time time1 = new Time(ora, perc, masodperc);

        Time time2 = new Time(ora2, perc2, masodperc2);


        System.out.println(time1.toString());
        System.out.println(time1.getInSeconds());

        System.out.println(time2.toString());
        System.out.println(time2.getInSeconds());

        System.out.println("Az első a korábbi? :" + time1.earlierThan(time2));
    }
}
