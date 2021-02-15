package exam03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers;

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
        passengers = new ArrayList<>();

    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public boolean bookPassenger(Passenger passenger) {
        if (boat.getMaxPassengers() > passengers.size()) {
            passengers.add(passenger);
            return true;
        }
        throw new IllegalArgumentException("Over the quote");
    }

    public double getPriceForPassenger(Passenger passenger) {
        return basicPrice * passenger.getCruiseClass().getMultiply();
    }

    public Passenger findPassengerByName(String name) {
        for (Passenger p : passengers) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        throw new IllegalArgumentException("Nincs ilyen utas");
    }
}
