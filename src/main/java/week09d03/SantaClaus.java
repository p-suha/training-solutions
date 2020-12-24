package week09d03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SantaClaus {
    private List<Person> persons = new ArrayList<>();

    public SantaClaus(List<Person> persons) {
        this.persons = persons;
    }

    public void getThroughChimneys() {
        for (Person person : persons) {

            person.setPresent();
        }
    }


    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("lajos", 10));
        persons.add(new Person("odon", 15));
        persons.add(new Person("geza", 33));
        persons.add(new Person("gizi", 18));


        SantaClaus st = new SantaClaus(persons);

        st.getThroughChimneys();
        System.out.println(persons.toString());
    }
}
