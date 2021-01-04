package isahasa.fleet;

import java.util.ArrayList;
import java.util.List;

public class Fleet {


    private List<Ship> boats = new ArrayList<>();

    private int waitingPersons;
    private int waitingCargo;

    public void addShip(Ship newShip) {
        boats.add(newShip);
    }

    public void loadShip(int numberOfPersons, int cargoWeight) {

        int remainingPersons = numberOfPersons;
        int remainingCargo = cargoWeight;

        for (Ship ship : boats) {
            if (ship instanceof CanCarryPassengers) {
                if (remainingPersons != 0) {
                    remainingPersons = ((CanCarryPassengers) ship).loadPassenger(remainingPersons);
                }

            }

            if (ship instanceof CanCarryGoods) {
                if (remainingCargo != 0) {
                    remainingCargo = ((CanCarryGoods) ship).loadCargo(remainingCargo);
                }
            }

        }

        waitingCargo = remainingCargo;
        waitingPersons = remainingPersons;
    }

    public int getWaitingPersons() {
        return waitingPersons;
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }
}
