package Sept06;

public class Bat extends Mammal implements Makafly, Swimmer{
    Bat(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return super.toString() + "is a bat";
    }

    @Override
    void makeSound() {
        System.out.println("tktktktktk");
    }
    @Override
    public void fly() {
        System.out.println(name + " flaps meh wings");
        return;
    }

    @Override
    public void swim() {
        System.out.println(name + " is dead");
//        return 0;
    }
}
