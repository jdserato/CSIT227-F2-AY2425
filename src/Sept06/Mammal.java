package Sept06;

public abstract class Mammal extends Animal{

    Mammal(String name, int age) {
        super(name, age);
    }

    void provideMilk() {
        System.out.println(name + " is providing milk");
    }

    void provideMilk(int liters) {
        System.out.println(name + " is providing " + liters + " liters of milk");
    }

    @Override
    public String toString() {
        return super.toString() + " is a mammal";
    }
}
