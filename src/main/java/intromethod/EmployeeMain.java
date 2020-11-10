package intromethod;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee = new Employee("Kis Pista", "2000", 100_000);

        System.out.println(employee);

        employee.setName("Nagy Róza");
        employee.raiseSalary(20_000);

        System.out.println(employee);

        System.out.println("Név: " + employee.getName());
        System.out.println("Belépés: " + employee.getHiringYear());
        System.out.println("Fizetés: " + employee.getSalary());
    }
}
