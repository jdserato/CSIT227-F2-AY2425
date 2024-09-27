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

        Random rand = new Random();
        game.addZombie(new Zombie(new Coord(rand.nextInt(5)+1)));
        game.addZombie(new Zombie(new Coord(rand.nextInt(5)+1)));
        game.addZombie(new Zombie(new Coord(rand.nextInt(5)+1)));

        game.startGame();
    }
}
