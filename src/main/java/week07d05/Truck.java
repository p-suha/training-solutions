package week07d05;

public class Truck extends Car {

    public Truck() {
        super(TransmissionType.MANUAL);
        setNumberOfGears(getDefaultNoG());
    }

    public Truck(int numberOfGears) {
        super(numberOfGears);
        setTransmissionType(TransmissionType.MANUAL);
    }

    public Truck(TransmissionType transmissionType) {
        super(transmissionType);
        setNumberOfGears(getDefaultNoG());
    }


    public Truck(int numberOfGears, TransmissionType transmissionType) {
        super(numberOfGears, transmissionType);
    }

}
