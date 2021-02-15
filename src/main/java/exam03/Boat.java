package exam03;

public class Boat {
    private String name;
    private int maxPassengers;

    public Boat(String name, int maxPassengers) {
        this.name = name;
        this.maxPassengers = maxPassengers;
    }

    public String getName() {
        return name;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }
}
