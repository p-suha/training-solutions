package week07d05;

public class TestMain {

    public static void main(String[] args) {

        Vehicle kismotor = new MotorCycle(3);
        Vehicle veh = new Vehicle();
        Car car = new Car();
        Car car2 = new Car(TransmissionType.SEQUENTIAL);
        Truck truck = new Truck();
        MotorCycle motorCycle = new MotorCycle();
        Vehicle kocsi = new Car(4, TransmissionType.AUTOMATIC);
        Car kamion = new Truck(7, TransmissionType.MANUAL);
        MotorCycle motorkerekpar = new MotorCycle(6, TransmissionType.SEQUENTIAL);

        System.out.println(kismotor.getNumberOfGears() + " - " + kismotor.getTransmissionType());
        System.out.println(veh.getNumberOfGears() + " - " + veh.getTransmissionType());
        System.out.println(car.getNumberOfGears() + " - " + car.getTransmissionType());
        System.out.println(car2.getNumberOfGears() + " - " + car2.getTransmissionType());
        System.out.println(truck.getNumberOfGears() + " - " + truck.getTransmissionType());
        System.out.println(motorCycle.getNumberOfGears() + " - " + motorCycle.getTransmissionType());
        System.out.println(kocsi.getNumberOfGears() + " - " + kocsi.getTransmissionType());
        System.out.println(kamion.getNumberOfGears() + " - " + kamion.getTransmissionType());
        System.out.println(motorkerekpar.getNumberOfGears() + " - " + motorkerekpar.getTransmissionType());

    }
}
