package localvariables;

public class DistaneMain {

    public static void main(String[] args) {
        Distance distance = new Distance(145.33, false);

        System.out.println(distance.getDistanceInKm() +" "+ distance.isExact());


        int egesz = (int) distance.getDistanceInKm();
        System.out.println(egesz);

    }
}
