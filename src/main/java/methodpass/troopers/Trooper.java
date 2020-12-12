package methodpass.troopers;

public class Trooper {


    private String name;
    private Position position;

    public Trooper(String name) {

        if (isEmpty(name)) {
            throw new IllegalArgumentException("Name must not be empty.");
        }

        this.name = name;
        this.position = new Position(0, 0);
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public void changePosition(Position newPosition) {
        if (newPosition == null) {
            throw new IllegalArgumentException("The new position must not be null");
        }

        this.position = newPosition;
    }

    public double distanceFrom(Position fromPosition) {

        return this.position.distanceFrom(fromPosition);

    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }
}
