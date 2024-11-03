package Sept27;

public class Shield {
    int hp;

    public Shield(int hp) {
        this.hp = hp;
    }

    static class Cone extends Shield {

        public Cone() {
            super(10);
        }
    }

    static class Bucket extends Shield implements Magnetic {

        public Bucket() {
            super(25);
        }

        @Override
        public void absorb() {
            hp = 0;
        }

        @Override
        public boolean isActive() {
            return hp > 0;
        }
    }

    static class Screendoor extends Shield implements Magnetic{
        public Screendoor() {
            super(20);
        }

        @Override
        public void absorb() {
            hp = 0;
        }

        @Override
        public boolean isActive() {
            return hp > 0;
        }
    }

    static class Newspaper extends Shield {
        public Newspaper() {
            super(5);
        }
    }
}
