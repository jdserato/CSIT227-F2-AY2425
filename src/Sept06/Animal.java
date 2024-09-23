package Sept06;

public abstract class Animal implements Comparable<Animal> {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void makeSound();

    @Override
    public String toString() {
        return "My name is " + name + " of age " + age;
    }

    @Override
    public int compareTo(Animal o) {
        return name.compareTo(o.name);
    }

}
