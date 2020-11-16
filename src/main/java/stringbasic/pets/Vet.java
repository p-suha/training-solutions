package stringbasic.pets;

import java.util.ArrayList;
import java.util.List;

public class Vet {

    private List<Pet> pets = new ArrayList<>();

    public List<Pet> getPets() {
        return pets;
    }

    public void addPet(Pet newPet){

        for(Pet vizsgaltpet:pets) {
            if(areEquals(vizsgaltpet, newPet)){
               return;
            }
        }
        pets.add(newPet);
    }

    private boolean areEquals(Pet pet1, Pet pet2) {
        return pet1.getRegistrationNumber().equals(pet2.getRegistrationNumber());
    }
}
