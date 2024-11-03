package Oct25;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("../../example.txt"))) {
            System.out.println("Successful");
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            System.err.println("File error. ");
            System.err.println(e.getMessage());
        }
        System.out.println("stuff");
        Scanner sc = new Scanner(System.in);
        try (FileWriter fw = new FileWriter("../../example.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter("../../another.txt"))) {
            for (int i = 0 ; i < 10000; i++ ) {
                String s = sc.nextLine();
                fw.write(s);
                fw.write("\n");
                fw.flush();
                bw.write(s);
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("File error " + e.getMessage());
        }

    }
}
