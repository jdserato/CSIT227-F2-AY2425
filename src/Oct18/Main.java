package Oct18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer>nums = new ArrayList<>();
        while (true) {
            try {
                System.out.print("Enter a numerator: ");
                String num = sc.nextLine();
                int n = Integer.parseInt(num);
                ensurePositive(n);
                System.out.print("Enter a denominator: ");
                int m = sc.nextInt();
                ensurePositive(m);
                System.out.println("Quotient is " + n / m);
                return;
            } finally {
                System.out.println("Ariel happened to me");
            }
        }
    }

    private static void ensurePositive(int i){
        if (i < 0) {
            throw new NotPositiveException(i);
        }
    }
}
