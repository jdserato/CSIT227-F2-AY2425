package Sept06;

public class Cat extends Mammal {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(" meow meow meow meoww meow meow meow meow meow");
    }

    @Override
    public String toString() {
        return super.toString() + " and I'm a cat";
    }
}
