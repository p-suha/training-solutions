package week02;

import java.util.ArrayList;
import java.util.List;

public class Position {

    private  String pos;
    private int bonus;

    public Position(String pos, int bonus) {
        this.pos = pos;
        this.bonus = bonus;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Position{" +
                "pos='" + pos + '\'' +
                ", bonus=" + bonus +
                '}';
    }

    public static void main(String[] args) {

        List<Position> positions = new ArrayList<>();

        positions.add(new Position("osztályvezető", 100_000));
        positions.add(new Position("főosztályvezető", 130_000));
        positions.add(new Position("menedzser", 230_000));
        positions.add(new Position("vezérigazgató", 330_000));

        for(Position rich:positions)
            if (rich.getBonus() > 150000) {
                System.out.println(rich.toString());
            }
    }
}
