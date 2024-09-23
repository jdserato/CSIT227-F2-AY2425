package Sept06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            numbers.add(rand.nextInt(100));
        }
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        Collections.sort(numbers);
        System.out.println("\nRESULT");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        Dog browny = new Dog("Browny", 7);
        System.out.println(browny);
        Cat siomeow = new Cat("Siomeow", 3);
        System.out.println(siomeow);
        browny.provideMilk();
        siomeow.provideMilk(5);
        Animal animal = new Cat("Vince", 18);
        System.out.println(animal);
        Bird tweetie = new Bird("Tweetie", 2);
        tweetie.printName();
        System.out.println(tweetie);
        List<Animal> animals = new ArrayList<>();
        animals.add(browny);
        animals.add(siomeow);
        animals.add(animal);
        animals.add(tweetie);
        animals.add(new Bat("Batman", 50));
        for (Animal a : animals) {
            System.out.println(a);
        }
        Collections.sort(animals);
        System.out.println("AFTER SORTING BY NAME");
        for (Animal a : animals) {
            System.out.println(a);
        }
        animals.sort(new AnimalAgeComparator());
        System.out.println("AFTER SORTING BY AGE");
        for (Animal a : animals) {
            System.out.println(a);
        }
    }
}
