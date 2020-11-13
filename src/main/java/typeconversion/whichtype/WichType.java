package typeconversion.whichtype;

import java.util.ArrayList;
import java.util.List;

public class WichType {

    public List<Type> wichType(String str) {

        List<Type> tipes = new ArrayList<>();
        for (Type item : Type.values()) {

            Long value = Long.parseLong(str);

            if (value < item.getMax() && value > item.getMin()) {
                tipes.add(item);
            }
        }

        return tipes;
    }

    }


