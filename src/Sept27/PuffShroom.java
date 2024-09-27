package Sept27;

public class PuffShroom extends Mushroom implements Attacker{
    int damage = 2;
    int range = 3;
    public PuffShroom(Coord location) {
        super(0, 2, location);
    }

    public int shootBubble() {
        if (isAsleep) {
            return 0;
        }
        return damage;
    }

    @Override
    public int attack() {
        return shootBubble();
    }

    @Override
    public int getRange() {
        return range;
    }
}
