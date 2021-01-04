package week10d01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hiking {

    private List<Double> magassagok = new ArrayList<>();

    public Hiking(List<Double> magassagok) {
        this.magassagok = magassagok;
    }

    public double getPlusElevation() {
        double sum = 0.0;

        for (int i = 1; i < magassagok.size(); i++) {
            if (magassagok.get(i) > magassagok.get(i - 1)) {
                sum += magassagok.get(i) - magassagok.get(i - 1);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Hiking hiking = new Hiking(Arrays.asList(10.0, 11.0, 15.0, 12.0, 13.0));
        System.out.println(hiking.getPlusElevation());
    }
}
