package enumtype.unit;

public enum LengthUnit {

    MILLIMETER(true, 1),
    CENTIMETER(true, 10),
    METER(true, 1000),
    YARD(false, 914.4),
    FOOT(false, 304.8),
    INCH (false, 25.4);

    private boolean isSiUnit;
    private double inMillimeter;

    LengthUnit(boolean isSiUnit, double inMillimeter) {
        this.inMillimeter = inMillimeter;
        this.isSiUnit = isSiUnit;
    }

    public boolean isSiUnit() {
        return isSiUnit;
    }

    public double getInMillimeter() {
        return inMillimeter;
    }
}
