package acmp;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_940 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new FileReader("INPUT.TXT"));
             FileWriter fileWriter = new FileWriter("OUTPUT.TXT")) {

            int num = scanner.nextInt();
            String line = scanner.nextLine().trim();

            StringBuilder stringBuilder = new StringBuilder(line).deleteCharAt(num-1);
            fileWriter.write(stringBuilder.toString());

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
