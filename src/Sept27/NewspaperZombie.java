package Sept27;

public class NewspaperZombie extends Zombie{
    Shield.Newspaper news;
    public NewspaperZombie(Coord location) {
        super(location);
        news = new Shield.Newspaper();
    }

    @Override
    public void takeDamage(int damage) {
        if (news.hp > 0) {
            news.hp -= damage;
            if (news.hp <= 0) {
                speed = 0.66;
                this.damage = 2;
            }
        } else {
            super.takeDamage(damage);
        }
    }


    @Override
    public String toString() {
        return super.toString() + " - paper: " + news.hp;
    }
}