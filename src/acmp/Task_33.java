package acmp;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_33 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new FileReader("INPUT.TXT"));
             FileWriter fileWriter = new FileWriter("OUTPUT.TXT")) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int a2 = b - 1;
            int b2 = a - 1;

            fileWriter.write(a2 + " " + b2);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
