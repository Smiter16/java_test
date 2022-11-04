package acmp;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task_529 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new FileReader("INPUT.TXT"));
             FileWriter fileWriter = new FileWriter("OUTPUT.TXT")) {

            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();

            double sqrt = Math.sqrt(Math.pow( x2 - x1, 2) + Math.pow( y2 - y1, 2));

            BigDecimal bigDecimal = BigDecimal.valueOf(sqrt).setScale(5, RoundingMode.HALF_UP);
            fileWriter.write(bigDecimal.toString());

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
