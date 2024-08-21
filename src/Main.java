import java.util.Scanner;
class Main {
    int stuff;
    public static void main(String[] args) { //psvm
        for (String str : args) {
            System.out.println(str.toUpperCase());
        }
        System.out.println("Hello World"); //sout
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.printf("Your age is %d.", age);
    }
}
