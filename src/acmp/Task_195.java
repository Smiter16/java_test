package acmp;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_195 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new FileReader("INPUT.TXT"));
             FileWriter fileWriter = new FileWriter("OUTPUT.TXT")) {

            String[] volume = scanner.nextLine().split(" ");
            int count = Integer.parseInt(volume[0]);
            int height = Integer.parseInt(volume[1]);
            int lengths = Integer.parseInt(volume[2]);

            int finalVolume = (count * height * lengths) * 2;

            fileWriter.write(finalVolume + "");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
