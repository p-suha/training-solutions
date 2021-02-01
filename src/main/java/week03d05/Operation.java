package week03d05;

public class Operation {

    private int leftoperand;
    private int rightoperand;

    public Operation(int leftoperand, int rightoperand) {
        this.leftoperand = leftoperand;
        this.rightoperand = rightoperand;
    }

    public int getResult() {
        return leftoperand + rightoperand;
    }
}
