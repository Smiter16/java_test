package acmp;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task_818 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new FileReader("INPUT.TXT"));
             FileWriter fileWriter = new FileWriter("OUTPUT.TXT")) {

            int count = scanner.nextInt();
            int sum = 0;

            for (int i = 0; i < count; i++){
                sum += scanner.nextInt();
            }
            int result = sum - (count -1);
            fileWriter.write(Integer.toString(result));

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
