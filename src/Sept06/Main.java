package Sept06;

import java.util.*;

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
        Cat siomeow = new Cat("Siomeow", 3);
        Animal animal = new Cat("Vince", 18);
        Bird tweetie = new Bird("Tweetie", 2);
//        tweetie.printName();
//        System.out.println(tweetie);
        List<Animal> animals = new ArrayList<>();
        {
            animals.add(browny);
            animals.add(siomeow);
            animals.add(animal);
            animals.add(tweetie);
        }
        animals.add(new Bat("Batman", 50));
        animals.add(new Cat("Meow", 5));
        animals.add(new Dog("Blacky", 6));
        animals.add(new Bat("Blacky", 9));
        animals.add(new Cat("Blacky", 1));
        animals.add(new Cat("Orinj", 6));
        System.out.println("Printing mammals");
        for (Animal a : animals) {
            if (a instanceof Mammal) {
                System.out.println(a);
            }
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
        Bat abat = new Bat("Blacky", 6);
        animals.add(abat);
        Bat abat2 = new Bat("Blacky", 6);
        animals.sort(new AnimalFriendComparator(abat2));
        System.out.println("AFTER SORTING BY FRIEND");
        for (Animal a : animals) {
            System.out.println(a);
        }
        System.out.println("SHOW ALL BLACKY");
        for (Animal a : animals) {
            if (a.equals(6)) {
                System.out.println(a);
            }
        }
    }
}
