package intromethod;

public class Employee {
    private String name;
    private String hiringYear;
    private int salary;

    public Employee (String name, String hiringYear, int salary){
        this.name = name;
        this.hiringYear = hiringYear;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getHiringYear() {
        return hiringYear;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String newname){
        this.name = newname;
    }

    public void raiseSalary(int raise){
        salary += raise;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hiringYear='" + hiringYear + '\'' +
                ", salary=" + salary +
                '}';
    }
}
