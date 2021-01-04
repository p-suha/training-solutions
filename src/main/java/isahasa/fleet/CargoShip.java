package isahasa.fleet;

public class CargoShip implements Ship, CanCarryGoods {

    private CanCarryGoods cCG;

    public CargoShip(int maxCargoWeight) {
        cCG = new CanCarryGoodsBehaviour(maxCargoWeight);
    }

    @Override
    public int loadCargo(int cargoWeight) {
        return cCG.loadCargo(cargoWeight);
    }

    @Override
    public int getCargoWeight() {
        return cCG.getCargoWeight();
    }
}
