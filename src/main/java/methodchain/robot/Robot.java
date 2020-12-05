package methodchain.robot;

import java.util.ArrayList;
import java.util.List;

public class Robot {

    private int distance = 0;
    private int azimut = 0;
    private List<NavigationPoint> navs = new ArrayList<>();


    public int getDistance() {
        return distance;
    }

    public int getAzimut() {

        return azimut;
    }

    public List<NavigationPoint> getNavigationList() {
        return navs;
    }

    public Robot go(int meter) {
        this.distance += meter;

        return this;

    }

    public Robot rotate(int angle) {

        this.azimut += angle;
        return this;
    }

    public Robot registerNavigationPoint() {
        this.navs.add(new NavigationPoint(this.distance, this.azimut));
        return this;
    }


}
