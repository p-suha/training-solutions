package debug.employees;

public class Employee {

    private String name;
    private int yearOfBirth;

   public Employee (String name, int yearOfBirth) {
       this.yearOfBirth = yearOfBirth;
       this.name = name;
   }

   public String getName() {
       return name;

   }

   public int getYearOfBirth() {
       return yearOfBirth;
   }
}
