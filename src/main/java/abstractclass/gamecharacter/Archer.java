package abstractclass.gamecharacter;

import java.util.Random;

public class Archer extends Character {

    private int numberOfArrow = 100;

    public Archer(Point position, Random random) {
        super(position, random);
        this.numberOfArrow = numberOfArrow;
    }

    public int getNumberOfArrow() {
        return numberOfArrow;
    }

    private int getActualSecondaryDamage() {
        return getRandom().nextInt(5) + 1;
    }

    private void shootingAnArrow(Character enemy) {
        numberOfArrow--;
        hit(enemy, getActualSecondaryDamage());
    }

    @Override
    void secondaryAttack(Character enemy) {
        shootingAnArrow(enemy);
    }
}
