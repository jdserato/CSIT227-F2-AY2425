package Sept27;

import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Plant> plants;
    List<Zombie> zombies;
    int sun;

    Game() {
        plants = new ArrayList<>();
        zombies = new ArrayList<>();
        sun = 50;
    }

    void addPlant(Plant p) {
        plants.add(p);
    }

    void addZombie(Zombie z) {
        zombies.add(z);
    }

    void startGame() throws InterruptedException {
        int time = 0;
        List<CoffeeBean> beans = new ArrayList<>();
        for (Plant p : plants) {
            if (p instanceof CoffeeBean) {
                for (Plant m : plants) {
                    System.out.println("Mushroom " + m.getLocation());
                    System.out.println("Coffee " + p.getLocation());
                    System.out.println("Result: " + (m.getLocation().equals(p.getLocation())));
                    if (m instanceof Mushroom && m.getLocation().equals(p.getLocation())) {
                        ((Mushroom) m).wakeUp((CoffeeBean) p);
                    }
                }
                beans.add((CoffeeBean) p);
            }
        }
        plants.removeAll(beans);
        while (true) {
            System.out.println("SUN: " + sun);
            System.out.println("LIST OF PLANTS: ");
            for (Plant p : plants) {
                if (time % p.getCooldown() == 0) {
                    if (p instanceof Sunflower) {
                        sun += ((Sunflower) p).provideSun();
                    }
                    if (p instanceof Attacker) {
                        Zombie z = findTarget(p);
                        if (z != null) {
                            z.takeDamage(((Attacker) p).attack());
                            if (z.isDead()) {
                                System.out.println("ZOMBIE DIES");
                                zombies.remove(z);
                                if (zombies.isEmpty()) {
                                    System.out.println("You get another plant");
                                    return;
                                }
                            }
                        }
                    }
                    if (p instanceof SunShroom) {
                        sun += ((SunShroom) p).provideSun();
                    }
                }
                System.out.println(p);
            }
            System.out.println("LIST OF ZOMBIES:");
            for (Zombie z : zombies) {
                Plant e = nearbyPlant(z);
                if (e != null) {
                    z.eat(e);
                    if (e.isDead()) {
                        System.out.println("PLANT DIES");
                        plants.remove(e);
                    }
                } else {
                    z.walk();
                    if (z.reachesHouse()) {
                        System.out.println("The zombiez ate out your brainzzz");
                        return;
                    }
                }
                System.out.println(z);
            }
            time++;
            Thread.sleep(500);
        }
    }

    private Zombie findTarget(Plant p) {
        int range = 0;
        if (p instanceof Attacker) {
            range = ((Attacker) p).getRange();
        }
        for (Zombie z : zombies) {
            if (p.getLocation().row == z.getLocation().row &&
            z.getLocation().col <= p.getLocation().col + range &&
            z.getLocation().col > p.getLocation().col) {
                return z;
            }
        }
        return null;
    }

    private Plant nearbyPlant(Zombie z) {
        for (Plant p : plants) {
            if (p.getLocation().row == z.getLocation().row &&
            p.getLocation().col >= z.getLocation().col-1 &&
            p.getLocation().col < z.getLocation().col) {
                return p;
            }
        }
        return null;
    }
}
