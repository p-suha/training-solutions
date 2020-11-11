package enumtype.unit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnitConverterMain {

    public static void main(String[] args) {

        UnitConvert converter = new UnitConvert();

        System.out.println(converter.convert(new BigDecimal(1), LengthUnit.MILLIMETER, LengthUnit.INCH));
        System.out.println(converter.convert(new BigDecimal(100), LengthUnit.YARD, LengthUnit.METER));

        System.out.println(Arrays.toString(LengthUnit.values()));
        System.out.println(converter.siUnits());

    }




}
