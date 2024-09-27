package Sept27;

public class Zombie {
    public static final int DEFAULT_HP = 12;
    private int hp;
    private int damage;
    private Coord location;
    private double speed;

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
}
