package abstractclass.gamecharacter;

public class BattleField {

    private int round;


    private boolean oneHit(Character attacker, Character defender) {
        if (defender.isAlive() && attacker.isAlive()) {
            attacker.primaryAttack(defender);
            attacker.secondaryAttack(defender);
        }
        return defender.isAlive() && attacker.isAlive();
    }


    public Character fight(Character one, Character other) {

        while (one.isAlive() && other.isAlive()) {
            oneHit(one, other);
            oneHit(other, one);
            round++;
        }

        return one.isAlive() ? one : other;
    }


    public int getRound() {
        return round;
    }
}
