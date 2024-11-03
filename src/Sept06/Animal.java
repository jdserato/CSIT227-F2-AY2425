package Sept06;

import java.util.Date;

public abstract class Animal implements Comparable<Animal> {
    String name;
    int age;
//    final Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    Animal(String name, int age) {
        this.name = name;
        this.age = age;
//        this.birthday = birthday;
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

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof String) {
            return obj == name;
        }
        if (obj instanceof Integer) {
            return (int) obj == age;
        }
        if (obj instanceof Animal) {
            if (((Animal) obj).age == age && ((Animal) obj).name == name
                    && obj.getClass() == this.getClass()) {
                return true;
            }
        }
        return super.equals(obj);
    }
}
