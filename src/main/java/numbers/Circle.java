package numbers;

public class Circle {

    private int diameter;
    private double pi;

    public Circle(int diameter) {
        this.diameter = diameter;
        pi = 3.14;
    }

    public double circlePerimeter() {

        return (double)diameter * pi;
    }

    public double circleArea() {

        return (diameter/2.0) * (diameter/2.0) * pi;
    }
}
