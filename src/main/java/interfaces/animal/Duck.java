package interfaces.animal;

public class Duck implements Animal {

    private int nol = 2;

    @Override
    public int getNumberOfLegs() {
        return nol;
    }

    @Override
    public String getName() {
        return "Duck";
    }
}
