package isahasa.fleet;

public class Liner implements Ship, CanCarryPassengers {

    private CanCarryPassengers canCP;

    public Liner(int maxPassengers) {
        canCP = new CanCarryPassengersBehaviour(maxPassengers);
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
