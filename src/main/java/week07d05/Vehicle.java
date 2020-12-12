package week07d05;

public class Vehicle {
    private int defaultNoG = 5;
    private int numberOfGears;
    private TransmissionType transmissionType;

    public Vehicle() {

        this.numberOfGears = defaultNoG;
        this.transmissionType = TransmissionType.MANUAL;
    }

    public Vehicle(int numberOfGears) {
        this.numberOfGears = numberOfGears;
        this.transmissionType = TransmissionType.MANUAL;
    }

    public Vehicle(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
        this.numberOfGears = defaultNoG;
    }

    public Vehicle(int numberOfGears, TransmissionType transmissionType) {
        this.numberOfGears = numberOfGears;
        this.transmissionType = transmissionType;
    }


    public int getNumberOfGears() {
        return numberOfGears;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public int getDefaultNoG() {
        return defaultNoG;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public void setTransmissionType(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }
}
