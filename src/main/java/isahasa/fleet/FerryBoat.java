package isahasa.fleet;

public class FerryBoat implements Ship, CanCarryGoods, CanCarryPassengers {

    private final CanCarryPassengers canCP;
    private final CanCarryGoods canCG;

    public FerryBoat(int maxCargoWeight, int maxPassengers) {
        canCG = new CanCarryGoodsBehaviour(maxCargoWeight);
        canCP = new CanCarryPassengersBehaviour(maxPassengers);
    }

    @Override
    public int loadCargo(int cargoWeight) {
        return canCG.loadCargo(cargoWeight);
    }

    @Override
    public int getCargoWeight() {
        return canCG.getCargoWeight();
    }

    @Override
    public int loadPassenger(int passengers) {
        return canCP.loadPassenger(passengers);
    }

    @Override
    public int getPassengers() {
        return canCP.getPassengers();
    }
}

