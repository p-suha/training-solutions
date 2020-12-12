package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {

    private List<Trooper> troopers = new ArrayList<>();

    public List<Trooper> getTroopers() {
        return troopers;
    }

    public void addTrooper(Trooper trooper) {
        troopers.add(trooper);
    }


    public void moveTrooper(Trooper trooper, Position toPosition) {
        trooper.changePosition(toPosition);
    }

    public void moveTrooperByName(String name, Position toPosition) {
        Trooper trooper = findTrooperByName(name);
        moveTrooper(trooper, toPosition);
    }

    public void moveClosestTrooper(Position fromPosition) {
        Trooper closest = findClosestTrooper(fromPosition);
        moveTrooper(closest, fromPosition);
    }


    private Trooper findTrooperByName(String name) {

        for (Trooper trooper : troopers) {
            if (trooper.getName().equals(name)) {
                return trooper;
            }
        }
        return null;
    }

    private Trooper findClosestTrooper(Position fromPosition) {

        Trooper closest = troopers.get(0);

        for (Trooper trooper : troopers) {
            if (trooper.distanceFrom(fromPosition) < closest.distanceFrom(fromPosition)) {
                closest = trooper;
            }
        }
        return closest;
    }
}
