package ioreadwritebytes;

public class Temperatures {

    private byte[] temperaturesArray;

    public Temperatures(byte[] temperaturesArray) {
        this.temperaturesArray = temperaturesArray;
    }

    public byte[] getData() {
        return temperaturesArray;
    }

    public double getYearAverage() {

        double sum = 0;
        for (int i = 0; i < temperaturesArray.length; i++) {

            sum += temperaturesArray[i];
        }

        double average = sum / temperaturesArray.length;
        return average;
    }

    public double getMonthAverage() {

        double sum = 0;
        for (int i = temperaturesArray.length - 1; i > temperaturesArray.length - 31; i--) {

            sum += temperaturesArray[i];
        }

        double average = sum / 30;
        return average;
    }
}
