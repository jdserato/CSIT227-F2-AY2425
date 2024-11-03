package Sept27;

public interface ZombieWithMetal {
    Magnetic getMagnetic();
    default boolean hasMagnetic() {
        return getMagnetic().isActive();
    }
}
