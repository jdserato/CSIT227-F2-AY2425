package Sept06;

public class Bird extends Animal{
    String name;
    int age;

    Bird(String name) {
        super(name);
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
