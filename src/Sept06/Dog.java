package Sept06;

public class Dog extends Mammal {
    Dog(String name) {
        super(name);
        System.out.println("Hi");
    }

    @Override
    void makeSound() {
        System.out.println(" aw aw");
    }

    @Override
    public String toString() {
        return super.toString() + " and I'm a dog";
    }
}
