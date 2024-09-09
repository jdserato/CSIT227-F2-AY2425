package Aug30;

public class Main {
    public static void main(String[] args) {
        Person vince = new Person("Jay Vince", "male");
        Person jay = vince;
        jay.setName("SERATO");
        System.out.println(vince.getName());
        Person jac = new Person(1,"canete");
        System.out.println(jay.getAge());
        System.out.println(jac.getAge());
        System.out.println(Person.SPECIES);

        System.out.println(Person.number_of_persons);
    }
}
