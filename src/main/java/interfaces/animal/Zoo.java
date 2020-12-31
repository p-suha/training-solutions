package interfaces.animal;

import java.util.List;

public class Zoo implements Animal {

    private List<Animal> animals;

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public int getNumberOfAnimals() {
        return animals.size();
    }

    public int getNumberOfLegs() {

        int nol = 0;
        for (Animal animal : animals) {
            nol += animal.getNumberOfLegs();
        }
        return nol;
    }

    @Override
    public String getName() {
        return getName();
    }
}

