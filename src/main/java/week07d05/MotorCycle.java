package week07d05;

public class MotorCycle extends Vehicle {

    public MotorCycle() {
        super(TransmissionType.SEQUENTIAL);
        setNumberOfGears(getDefaultNoG());
    }

    public MotorCycle(int numberOfGears) {
        super(numberOfGears);
        setTransmissionType(TransmissionType.SEQUENTIAL);
    }

    public MotorCycle(TransmissionType transmissionType) {
        super(TransmissionType.MANUAL);
        setNumberOfGears(getDefaultNoG());
    }

    public MotorCycle(int numberOfGears, TransmissionType transmissionType) {
        super(numberOfGears, transmissionType);
    }
}
