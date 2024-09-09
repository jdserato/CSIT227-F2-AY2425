package Aug27;

import java.util.Date;

public class Person {
    int age;
    String name;
    Person mother, father;
    Date birthday;
    Person() {
        System.out.println("Creating a person");
        age = 18;
    }

    Person(String name, Person father) {
        this.name = name;
        this.father = father;
    }

    Person(Person mother, String name) {
        this.name = name;
        this.mother = mother;
    }

    Person(String other) {
        System.out.println("Creating a person");
        age = 18;
        name = other;
    }

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
        age = 2024 - birthday.getYear();
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void talk() {
        System.out.println("Hi! I'm "+name+" of age "+age+"!");
    }

    int talk(String greeting) {
        System.out.println(greeting +"! I'm "+name+" of age "+age+"!");
        return 0;
    }
}
