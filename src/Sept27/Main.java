package Sept27;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Game game = new Game();
        game.addPlant(new Sunflower(new Coord(1,1)));
        game.addPlant(new SunShroom(new Coord(3,1)));
        game.addPlant(new Sunflower(new Coord(5,1)));

        game.addPlant(new Peashooter(new Coord(2,4)));
        game.addPlant(new PuffShroom(new Coord(3,4)));
        game.addPlant(new CoffeeBean(new Coord(3, 4)));
        game.addPlant(new PuffShroom(new Coord(4,4)));
        game.addPlant(new CoffeeBean(new Coord(4, 4)));
        game.addPlant(new PuffShroom(new Coord(1,7)));
        game.addPlant(new CoffeeBean(new Coord(1, 7)));
        game.addPlant(new Peashooter(new Coord(5,4)));
        game.addPlant(new Mushroom.MagnetShroom(new Coord(5,5)));
        game.addPlant(new CoffeeBean(new Coord(5, 5)));

        Random rand = new Random();
        game.addZombie(new NewspaperZombie(new Coord(rand.nextInt(5)+1)));
        game.addZombie(new Zombie.BucketheadZombie(new Coord(rand.nextInt(5)+1)));
        game.addZombie(new Zombie.ConeheadZombie(new Coord(rand.nextInt(5)+1)));
        game.addZombie(new Zombie.ScreendoorZombie(new Coord(rand.nextInt(5)+1)));

        game.startGame();
    }
}
