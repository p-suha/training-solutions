package week13d04;

public class Employee {

    private String name;
    private int yob;

    public Employee(String name, int yob) {
        this.name = name;
        this.yob = yob;
    }

    public String getName() {
        return name;
    }

    public int getYob() {
        return yob;
    }
}
