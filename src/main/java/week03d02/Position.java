package week03d02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Position {

    private String name;
    private int bonus;

    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Position{" +
                "name='" + name + '\'' +
                ", bonus=" + bonus +
                '}';
    }


    public static void main(String[] args) {

        Position pos1 = new Position("boss", 200000);
        Position pos2 = new Position("ceo", 175000);
        Position pos3 = new Position("employee", 5000);
        List<Position> poslist = List.of(pos1, pos2, pos3);

        for (Position p : poslist) {
            if (p.bonus > 150000) {

                System.out.println(p.toString());
            }
        }
    }
}
