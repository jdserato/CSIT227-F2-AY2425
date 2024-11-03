package Aug27;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        // vince is the object; an instance of a Person
        Person vince = new Person();
        vince.name = "Jay Vince Serato";
        Person another = new Person("Someone Else", new Date(2020, 4, 13));
        vince.talk("Cool and normal");
        Person anakNako = new Person(vince, "name");
        another.talk();
        System.out.println(Character.isAlphabetic('4'));
        Character.isWhitespace(' ');
        int number = 5;
        double num = (double) number;
        String name ="Jay Vince Serato";
        int len = name.length();
        Math.sqrt(25);
        for (char ch : name.toCharArray()) {
            if (Character.isAlphabetic(ch)) {

            }
        }
    }
}
