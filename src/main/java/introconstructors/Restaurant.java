package introconstructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Restaurant {

    private List<String> menu = new ArrayList<>();

    private String name;
    private int capacity;

    public Restaurant(String name, int numberOfTables) {
        this.name = name;
        this.capacity = numberOfTables * 4;
        this.menu = addMenu();
    }

    private List<String> addMenu() {
        return Arrays.asList("Fincsi Leves", "Tartalmas készétel", "Izgalmas frissensült", "különleges desszert");
    }

    public void setMenu(List<String> menu) {
        this.menu = menu;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<String> getMenu() {
        return menu;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}


