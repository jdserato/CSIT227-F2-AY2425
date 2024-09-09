package Sept06;

public class Main {
    public static void main(String[] args) {
        Dog browny = new Dog("Browny");
        System.out.println(browny);
        Cat siomeow = new Cat("Siomeow");
        System.out.println(siomeow);
        browny.provideMilk();
        siomeow.provideMilk(5);
        Animal animal = new Cat("Vince");
        System.out.println(animal);
        Bird tweetie = new Bird("Tweetie");
        tweetie.printName();
        System.out.println(tweetie);
    }
}
