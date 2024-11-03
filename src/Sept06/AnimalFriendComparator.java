package Sept06;

import java.util.Comparator;

public class AnimalFriendComparator implements Comparator<Animal> {
    Animal a;

    public AnimalFriendComparator(Animal a) {
        this.a = a;
    }

    @Override
    public int compare(Animal o1, Animal o2) {
        int diffA1 = Math.abs(o1.age - a.age);
        int diffA2 = Math.abs(o2.age - a.age);
        if (diffA2 == diffA1) {
            return Integer.compare(o1.age, o2.age);
        }
        return Integer.compare(diffA1, diffA2);
    }
}
