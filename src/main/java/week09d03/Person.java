package week09d03;

import java.util.Random;

public class Person {

    private String name;
    private int age;
    private Present present;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Present randomPresent() {

        int size = Present.values().length;
        Present[] values = Present.values();
        int randomPresentIndex = new Random().nextInt(size);
        Present rPresent = values[randomPresentIndex];
        return rPresent;
    }

    public void setPresent() {
        Present rPresent = randomPresent();
        if (age > 14 && rPresent.equals(Present.TOY)) {
            rPresent = null;
            setPresent();
        } else {
            this.present = rPresent;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Present getPresent() {
        return present;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", present=" + present +
                '}';
    }
}