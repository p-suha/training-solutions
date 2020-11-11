package enumtype.unit;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class UnitConvert {

    public BigDecimal convert(BigDecimal length, LengthUnit source, LengthUnit target) {

       return length.multiply(new BigDecimal(source.getInMillimeter())).divide(new BigDecimal(target.getInMillimeter()), 4, RoundingMode.HALF_UP);

    }

    public List<LengthUnit> siUnits () {
        List<LengthUnit> units = new ArrayList<>();

        for (LengthUnit unit:LengthUnit.values()) {
            if (unit.isSiUnit()) {
                units.add(unit);
            }
        }
        return units;
    }
}
