package stringconcat;

public class Employee {

    private String name;
    private String job;
    private int salary;

    public Employee(String name, String job, int salary) {

        if (isEpmty(name)) {
            throw new IllegalArgumentException ("Name must not be empty.");
        }
        this.name = name;


        if (isEpmty(job)) {
            throw new IllegalArgumentException("Job must not be empty.");
        }
        this.job = job;

        if(salary <= 0 ) {
            throw new IllegalArgumentException("Salary must be positive.");
        }
        this.salary = salary;
    }



    public String toString() {

        return name +" - " + job+ " - " + salary +" Ft";
    }

public boolean isEpmty(String forValidate) {

        return forValidate == null || forValidate.equals("");


}
    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getSalary() {
        return salary;
    }
}
