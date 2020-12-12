package week07d05;

public class Car extends Vehicle {


    public Car() {
        super(TransmissionType.AUTOMATIC);

    }

    public Car(int numberOfGears) {
        super(numberOfGears);
        setTransmissionType(TransmissionType.AUTOMATIC);
    }

    public Car(TransmissionType transmissionType) {
        super(transmissionType);
        setNumberOfGears(getDefaultNoG());
    }

    public Car(int numberOfGears, TransmissionType transmissionType) {
        super(numberOfGears, transmissionType);


    }

    @Override
    public int getNumberOfGears() {
        return super.getNumberOfGears();
    }

    @Override
    public TransmissionType getTransmissionType() {
        return super.getTransmissionType();
    }
}

