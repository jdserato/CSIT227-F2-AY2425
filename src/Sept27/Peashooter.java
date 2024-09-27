package Sept27;

public class Peashooter extends Plant implements Attacker{
    int damage = 2;
    int range = 10;
    public Peashooter(Coord location) {
        super(100, 2, location);
    }

    public int shootPea() {
        return damage;
    }

    @Override
    public int attack() {
        return shootPea();
    }

    @Override
    public int getRange() {
        return range;
    }
}
