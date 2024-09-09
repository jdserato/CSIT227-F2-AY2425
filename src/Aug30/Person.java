package Aug30;

public class Person {
    final public  static String SPECIES = "homo sapiens";
    private String name;
    int gender;
    String address;
    int age;
    String birthdate;
    String course;
    float grades;
    static int number_of_persons = 0;



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public float getGrades() {
        return grades;
    }

    public void setGrades(float grades) {
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }
    // method overloading
    public Person(String name) {
        this.name = name;
        age = 18;
        System.out.println("creating person");
        number_of_persons++;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("creating person");
        number_of_persons++;
    }

    public Person( int gender, String name) {
        this.name = name;
        this.gender = gender;
    }
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void work() {

    }

    void talk() {
        int i;
        System.out.println("im talking");
    }
}
