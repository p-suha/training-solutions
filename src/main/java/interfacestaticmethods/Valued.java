package interfacestaticmethods;

import java.util.List;

public interface Valued {


    static double totalValue(List<Valued> results) {

        double sum = 0;
        for (int i = 0; i < results.size(); i++) {
            sum += results.get(i).getValue();
        }

        return sum;
    }

    double getValue();
}
