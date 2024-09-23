package Sept06;

public class Dog extends Mammal {
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(" aw aw");
    }

}
