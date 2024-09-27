package Sept27;

public class Mushroom extends Plant{
    boolean isAsleep;

    public Mushroom(int sunCost, int cooldown, Coord location) {
        super(sunCost, cooldown, location);
        isAsleep = true;
    }

    public void wakeUp(CoffeeBean cb) {
        isAsleep = false;
        cb.die();
    }
}
