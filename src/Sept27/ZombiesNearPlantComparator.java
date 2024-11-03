package Sept27;

import java.util.Comparator;

public class ZombiesNearPlantComparator implements Comparator<Zombie> {
    Plant p;

    public ZombiesNearPlantComparator(Plant p) {
        this.p = p;
    }

    @Override
    public int compare(Zombie o1, Zombie o2) {
        double distZ1 = o1.getLocation().distance(p.getLocation());
        double distZ2 = o2.getLocation().distance(p.getLocation());
        return Double.compare(distZ1, distZ2);
    }
}
