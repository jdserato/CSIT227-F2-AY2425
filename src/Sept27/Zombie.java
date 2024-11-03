package Sept27;

public class Zombie {
    public static final int DEFAULT_HP = 12;
    private int hp;
    protected int damage;
    private Coord location;
    protected double speed;

    public Zombie(int hp, int damage, Coord location, double speed) {
        this.hp = hp;
        this.damage = damage;
        this.location = location;
        this.speed = speed;
    }

    public Zombie(Coord location) {
        this.location = location;
        speed = 0.33;
        damage = 1;
        hp = DEFAULT_HP;
    }

    public void eat(Plant p) {
        p.takeDamage(damage);
    }

    public void walk() {
        location.col -= speed;
    }


    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public Coord getLocation() {
        return location;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return getClass() + " (hp: " + hp + "; loc: " + location + ")";
    }

    public void takeDamage(int damage) {
        hp -= damage;
    }

    public boolean isDead() {
        return hp <= 0;
    }

    public boolean reachesHouse() {
        return location.col <= 0;
    }

    static class ConeheadZombie extends Zombie {
        Shield.Cone cone;

        public ConeheadZombie(Coord location) {
            super(location);
            cone = new Shield.Cone();
        }

        @Override
        public void takeDamage(int damage) {
            if (cone.hp > 0) {
                cone.hp -= damage;
            } else {
                super.takeDamage(damage);
            }
        }

        @Override
        public String toString() {
            return super.toString() + " - cone: " + cone.hp;
        }
    }

    static class BucketheadZombie extends Zombie implements ZombieWithMetal{
        Shield.Bucket bucket;

        public BucketheadZombie(Coord location) {
            super(location);
            bucket = new Shield.Bucket();
        }

        @Override
        public void takeDamage(int damage) {
            if (bucket.hp > 0) {
                bucket.hp -= damage;
            } else {
                super.takeDamage(damage);
            }
        }
        @Override
        public String toString() {
            return super.toString() + " - bucket: " + bucket.hp;
        }

        @Override
        public Magnetic getMagnetic() {
            return bucket;
        }
    }

    static class ScreendoorZombie extends Zombie implements ZombieWithMetal{
        Shield.Screendoor door;

        public ScreendoorZombie(Coord location) {
            super(location);
            door = new Shield.Screendoor();
        }
        @Override
        public void takeDamage(int damage) {
            if (door.hp > 0) {
                door.hp -= damage;
            } else {
                super.takeDamage(damage);
            }
        }
        @Override
        public String toString() {
            return super.toString() + " - door: " + door.hp;
        }

        @Override
        public Magnetic getMagnetic() {
            return door;
        }
    }
}
