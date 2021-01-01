package virtualmethod.vehicle;

public class Car extends Vehicle {

    protected int numberOfPassengers;

    public Car(int vehicleWeight, int numberOfPassengers) {
        super(vehicleWeight);
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public int getGrossLoad() {
        return super.getGrossLoad() + (numberOfPassengers * getPersonAverageWeight());
    }

    @Override
    public String toString() {
        return "Car{numberOfPassenger=" + numberOfPassengers + ", vehicleWeight=" + getVehicleWeight() + "}";
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }
}
