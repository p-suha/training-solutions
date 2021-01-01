package virtualmethod.vehicle;

public class Van extends Car {

    private int cargoWeight;

    public Van(int numberOfPassengers, int vehicleWeight, int cargoWeight) {
        super(vehicleWeight, numberOfPassengers);
        this.cargoWeight = cargoWeight;
    }

    @Override
    public int getGrossLoad() {
        return cargoWeight + super.getGrossLoad();
    }


    @Override
    public String toString() {
        return "Van{" +
                "cargoWeight=" + cargoWeight +
                ", numberOfPassenger=" + getNumberOfPassengers() + ", vehicleWeight=" + getVehicleWeight() + "}";
    }
}
