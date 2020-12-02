package immutable.satellite;

public class Satellite {

    private CelestialCoordinates destinationCoordinates;
    private String registerIdent;

    public Satellite(CelestialCoordinates destinationCoordinates, String registerIdent) {
        this.destinationCoordinates = destinationCoordinates;

        if (registerIdent == "") {
            throw new IllegalArgumentException("Register ident must not be empty!");
        }
        this.registerIdent = registerIdent;
    }

    public void modifyDestination(CelestialCoordinates diff) {

        destinationCoordinates = new CelestialCoordinates(
                destinationCoordinates.getX() + diff.getX(), // ennek itt a get metódusa mit ad vissza?
                destinationCoordinates.getY() + diff.getY(),
                destinationCoordinates.getZ() + diff.getZ());
    }

    public String toString() {
        return registerIdent + ": " + destinationCoordinates.toString();
    }


    public CelestialCoordinates getDestinationCoordinates() {
        return destinationCoordinates;
    }

    public String getRegisterIdent() {
        return registerIdent;
    }
}
