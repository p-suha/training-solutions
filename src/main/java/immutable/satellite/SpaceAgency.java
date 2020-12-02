package immutable.satellite;

import java.util.ArrayList;
import java.util.List;

public class SpaceAgency {

    private List<Satellite> satellitesList = new ArrayList<>();

    public void registerSatellite(Satellite satellite) {

        if (satellite == null) {
            throw new NullPointerException("Parameter must not be null!");
        }

        satellitesList.add(satellite);
    }


    public Satellite findSatelliteByRegisterIdent(String registerIdent) {

        for (Satellite sat : satellitesList) {
            if (sat.getRegisterIdent().equals(registerIdent)) {

                return sat;
            }
        }
        throw new IllegalArgumentException("Satellite with the given registration cannot be found!" + registerIdent);
    }

    public String toString() {

        return satellitesList.toString();
    }
}
