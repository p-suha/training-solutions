package debug.employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompanyMain {
    public static void main(String[] args) {


    Employee emp1 = new Employee("Kis Géza", 1970);
    Employee emp2 = new Employee("Nagy Ödön", 1975);
    Employee emp3 = new Employee("Kovács Elemér", 1980);

    Company company = new Company(new ArrayList<>());

    company.addEmployee(emp1);
    company.addEmployee(emp2);
    company.addEmployee(emp3);

            System.out.println(company.listEmployeeNames());

        System.out.println("Kit keresel?");

        Scanner scanner = new Scanner(System.in);
        String keresem = scanner.nextLine();

        System.out.println(company.findEmployeeByName(keresem).getName());

    }
}
