package Sept27;

public class SunShroom extends Mushroom{
    private State state;

    public SunShroom( Coord location) {
        super(25, 5, location);
        state = State.SMALL;
    }

    int provideSun() {
        if (isAsleep) {
            return 0;
        }
        if (state == State.SMALL) {
            return 15;
        }
        return 25;
    }

    void grow() {
        state = State.BIG;
    }

    enum State {
        SMALL, BIG
    }
}
