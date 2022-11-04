package acmp;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_692 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new FileReader("INPUT.TXT"));
             FileWriter fileWriter = new FileWriter("OUTPUT.TXT")) {

            String[] volume = scanner.nextLine().split(" ");
            int n = Integer.parseInt(volume[0]);
            int count = 0;

            for (int i=1; i<=10000; i*=2){
                if (i == n){
                    count++;
                }
                else {
                }
            }
            if (count > 0){
                fileWriter.write("YES");
            } else {
                fileWriter.write("NO");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
