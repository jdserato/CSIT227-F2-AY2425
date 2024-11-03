package Sept27;

public class Sunflower extends Plant implements SunProducer{
    public Sunflower(Coord location) {
        super(50, 5, location);
    }

    public int provideSun() {
        return 25;
    }
}
