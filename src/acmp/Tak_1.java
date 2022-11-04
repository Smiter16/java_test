package acmp;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Tak_1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new FileReader("INPUT.TXT"));
             FileWriter fileWriter = new FileWriter("OUTPUT.TXT")) {

            String[] counter = scanner.nextLine().split(" ");
            int num1= Integer.parseInt(counter[0]);
            int num2 = Integer.parseInt(counter[1]);
            int num = num1 + num2;

            fileWriter.write(num + "");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
