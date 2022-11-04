package acmp;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_942 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new FileReader("INPUT.TXT"));
             FileWriter fileWriter = new FileWriter("OUTPUT.TXT")) {

            String[] volume = scanner.nextLine().split(" ");

            fileWriter.write('1');

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
