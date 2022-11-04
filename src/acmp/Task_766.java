package acmp;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_766 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new FileReader("INPUT.TXT"));
             FileWriter fileWriter = new FileWriter("OUTPUT.TXT")) {

            String[] volume = scanner.nextLine().split(" ");
            int N = Integer.parseInt(volume[0]);
            int M = Integer.parseInt(volume[1]);
            int K = Integer.parseInt(volume[2]);

            if (N * M  >= K){
                fileWriter.write("YES");
            } else {
                fileWriter.write("NO");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
