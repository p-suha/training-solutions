package week07d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {

    @Test
    public void testVehicle() {
        //Vehicle
        assertEquals(5, new Vehicle().getNumberOfGears());
        assertEquals(TransmissionType.MANUAL, new Vehicle().getTransmissionType());

        assertEquals(5, new Vehicle(TransmissionType.AUTOMATIC).getNumberOfGears());
        assertEquals(TransmissionType.AUTOMATIC, new Vehicle(TransmissionType.AUTOMATIC).getTransmissionType());

        assertEquals(6, new Vehicle(6).getNumberOfGears());
        assertEquals(TransmissionType.MANUAL, new Vehicle(6).getTransmissionType());

        assertEquals(5, new Vehicle(5, TransmissionType.MANUAL).getNumberOfGears());
        assertEquals(3, new Vehicle(3, TransmissionType.AUTOMATIC).getNumberOfGears());
        assertEquals(TransmissionType.AUTOMATIC, new Vehicle(3, TransmissionType.AUTOMATIC).getTransmissionType());
        assertEquals(5, new Vehicle(5, TransmissionType.SEQUENTIAL).getNumberOfGears());
        assertEquals(TransmissionType.SEQUENTIAL, new Vehicle(3, TransmissionType.SEQUENTIAL).getTransmissionType());

        //Car
        assertEquals(5, new Car().getNumberOfGears());
        assertEquals(TransmissionType.AUTOMATIC, new Car().getTransmissionType());

        assertEquals(5, new Car(TransmissionType.AUTOMATIC).getNumberOfGears());
        assertEquals(TransmissionType.AUTOMATIC, new Car(TransmissionType.AUTOMATIC).getTransmissionType());

        assertEquals(6, new Car(6).getNumberOfGears());
        assertEquals(TransmissionType.AUTOMATIC, new Car(6).getTransmissionType());

        assertEquals(5, new Car(5, TransmissionType.MANUAL).getNumberOfGears());
        assertEquals(3, new Car(3, TransmissionType.AUTOMATIC).getNumberOfGears());
        assertEquals(TransmissionType.AUTOMATIC, new Car(3, TransmissionType.AUTOMATIC).getTransmissionType());
        assertEquals(5, new Car(5, TransmissionType.SEQUENTIAL).getNumberOfGears());
        assertEquals(TransmissionType.SEQUENTIAL, new Car(3, TransmissionType.SEQUENTIAL).getTransmissionType());

        //MotorCycle
        assertEquals(5, new MotorCycle().getNumberOfGears());
        assertEquals(TransmissionType.SEQUENTIAL, new MotorCycle().getTransmissionType());

        assertEquals(5, new MotorCycle(TransmissionType.AUTOMATIC).getNumberOfGears());
        assertEquals(TransmissionType.MANUAL, new MotorCycle(TransmissionType.MANUAL).getTransmissionType());

        assertEquals(6, new MotorCycle(6).getNumberOfGears());
        assertEquals(TransmissionType.SEQUENTIAL, new MotorCycle(6).getTransmissionType());

        assertEquals(5, new MotorCycle(5, TransmissionType.MANUAL).getNumberOfGears());
        assertEquals(3, new MotorCycle(3, TransmissionType.AUTOMATIC).getNumberOfGears());
        assertEquals(TransmissionType.AUTOMATIC, new MotorCycle(3, TransmissionType.AUTOMATIC).getTransmissionType());
        assertEquals(5, new MotorCycle(5, TransmissionType.SEQUENTIAL).getNumberOfGears());
        assertEquals(TransmissionType.SEQUENTIAL, new MotorCycle(3, TransmissionType.SEQUENTIAL).getTransmissionType());

        /// TRUCK
        assertEquals(5, new Truck().getNumberOfGears());
        assertEquals(5, new Truck(TransmissionType.AUTOMATIC).getNumberOfGears());
        assertEquals(TransmissionType.MANUAL, new Truck(3).getTransmissionType());
        assertEquals(5, new Truck(5, TransmissionType.SEQUENTIAL).getNumberOfGears());
        assertEquals(TransmissionType.SEQUENTIAL, new Truck(3, TransmissionType.SEQUENTIAL).getTransmissionType());
    }
}