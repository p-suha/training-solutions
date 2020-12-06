package methodparam.measuring;

public class Measurement {

    private double[] values;

    public Measurement(double[] values) {
        this.values = values;
    }

    public double[] getValues() {
        return values;
    }

    public int findFirstIndexInLimit(int lower, int upper) {

        for (int i = 0; i < values.length; i++) {

            if (values[i] < upper && values[i] > lower) {

                return i;
            }
        }
        return -1;
    }

    public double minimum() {

        double minimum = values[0];
        for (int i = 0; i < values.length; i++) {

            if (values[i] < minimum) {
                minimum = values[i];
            }

        }
        return minimum;
    }

    public double maximum() {

        double maximum = values[0];

        for (int i = 0; i < values.length; i++) {

            if (values[i] > maximum) {
                maximum = values[i];
            }
        }
        return maximum;
    }

    public ExtremValues minmax() {

        return new ExtremValues(minimum(), maximum());

    }
}
