package Sept06;

public abstract class Animal {
    String name;
    int age;

    Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();

    @Override
    public String toString() {
        return "My name is " + name + " of age " + age;
    }
}
