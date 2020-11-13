package typeconversion.dalatoss;

public class DataLoss {

    private long number = 0;
    private float convertedTemp = (float)number;
    private long converted = (long)convertedTemp;

    public long getNumber() {
        return number;
    }

    public long getConverted() {
        return converted;
    }

    public void  dataLoss() {
        long number = 0;
        for (long counter = 0; counter < 4; number++) {

            long convertedNumber = (long) (float) number;

            if (number != convertedNumber) {
                System.out.println("Number: " + number + ", Converted number:" + convertedNumber);
                System.out.println("Number in binary: " + Long.toBinaryString(number) + ", Converted number in binary " + Long.toBinaryString(convertedNumber));
                System.out.println();

                counter++;
            }

            }
    }


    public static void main(String[] args) {

        DataLoss dataloss = new DataLoss();
        dataloss.dataLoss();
    }
}

