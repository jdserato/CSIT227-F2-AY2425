package Sept06;

public class Bird  extends Animal implements Makafly{
    String name;
    int age;

    Bird(String name, int age) {
        super(name, age);
        this.name = name;
    }

    @Override
    void makeSound() {
        System.out.println("tweet");
    }

    void printName() {
        System.out.println("Bird name : " + name);
        System.out.println("Animal name: " + super.name);
    }

}
