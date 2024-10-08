package Sept06;

import java.util.Comparator;

public class AnimalAgeComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        // wrapper types
        return Integer.compare(o1.age, o2.age);
    }
}
