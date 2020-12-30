package inheritancemethods.products;

import java.math.BigDecimal;

public class PackedProduct extends Product {

    private int packingUnit;
    private BigDecimal weightOfBox;

    public PackedProduct(String name, BigDecimal unitWeight, int numberOfDecimals, int packingUnit, BigDecimal weightOfBox) {
        super(name, unitWeight, numberOfDecimals);
        this.packingUnit = packingUnit;
        this.weightOfBox = weightOfBox;
    }

    public int getPackingUnit() {
        return packingUnit;
    }

    public BigDecimal getWeightOfBox() {
        return weightOfBox;
    }

    @Override
    public BigDecimal totalWeight(int pieces) {

        int numberOfBoxes;

        if (pieces % packingUnit == 0) {
            numberOfBoxes = pieces / packingUnit;
        } else {
            numberOfBoxes = (pieces / packingUnit) + 1;
        }
        BigDecimal summaBoxesWeight = weightOfBox.multiply(new BigDecimal(numberOfBoxes));

        return super.totalWeight(pieces).add(summaBoxesWeight);
    }
}
