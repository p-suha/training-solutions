package week06d05;

import java.math.BigDecimal;

public class Biscuit {


    private BiscuitType type;
    private int gramAmount;

    public Biscuit(BiscuitType type, int gramAmount) {
        this.type = type;
        this.gramAmount = gramAmount;
    }

    public BiscuitType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Biscuit{" +
                "type=" + type +
                ", gramAmount=" + gramAmount +
                '}';
    }

    public static Biscuit of(BiscuitType biscuitType, int gramAmount) {

        return new Biscuit(biscuitType, gramAmount);

    }

    public static void main(String[] args) {
        Biscuit biscuit = new Biscuit(BiscuitType.MESE, 10);

        System.out.println(biscuit.of(BiscuitType.HT, 100).toString());


    }

}

