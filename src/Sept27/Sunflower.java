package Sept27;

public class Sunflower extends Plant{
    public Sunflower(Coord location) {
        super(50, 5, location);
    }

    int provideSun() {
        return 25;
    }
}
