package Sept27;

public class Plant {
    public static final int DEFAULT_HP = 8;
    private int sunCost;
    private int hp;
    private int cooldown;
    private Coord location;

    public Plant(int sunCost, int hp, int cooldown, Coord location) {
        this.sunCost = sunCost;
        this.hp = hp;
        this.cooldown = cooldown;
        this.location = location;
    }

    public Plant(int sunCost, int cooldown, Coord location) {
        this.sunCost = sunCost;
        this.cooldown = cooldown;
        this.location = location;
        hp = DEFAULT_HP;
    }

    protected void die() {
        hp = 0;
    }

    public int getSunCost() {
        return sunCost;
    }

    public int getHp() {
        return hp;
    }

    public int getCooldown() {
        return cooldown;
    }

    public Coord getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return getClass().toString().substring(getClass().toString().lastIndexOf('.')+1) + " (hp: " + hp + "; loc: " + location + ")";
    }

    public void takeDamage(int damage) {
        hp -= damage;
    }

    public boolean isDead() {
        return hp <= 0;
    }
}
