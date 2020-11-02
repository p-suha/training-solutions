package statements;

public class Investment {
    private double cost = 0.3;
    private int fund;
    private int interestRate;
    private boolean active = true;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;

    }

    public int getFund() {
        return fund;
    }

    public double getYield(int days) {

        //return fund * interestRate * days / (100.0 * 365);
        return (((fund * interestRate/100.0) / 365.0) * days);
    }
    public double close (int days) {
        double teljesOsszeg = (getFund() + getYield(days) ) * (1 - cost / 100);
        double kifizetes = active ? teljesOsszeg : 0;
        active = false;
        return kifizetes;
    }

}
