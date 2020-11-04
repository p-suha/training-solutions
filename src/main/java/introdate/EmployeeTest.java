package introdate;

import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Név: ");
         String neve = scanner.nextLine();

        System.out.println("Születési év: ");
        int ev = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Születési hónap");
        int honap = scanner.nextInt();
        scanner.nextLine();

        System.out.println("születési nap: ");
        int nap = scanner.nextInt();
        scanner.nextLine();

        Employee employee = new Employee(neve, ev, honap, nap);

        System.out.println("Az adatok: \n Név: " + employee.getName() + "\n Születési idő: " + employee.getDateOfBirth() + "\n Belépés ideje: " + employee.getBeginEmployment());


    }
}
