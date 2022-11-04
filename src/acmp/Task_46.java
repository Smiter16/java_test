package acmp;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task_46 {

    public static final String E = "2.7182818284590452353602875";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new FileReader("INPUT.TXT"));
             FileWriter fileWriter = new FileWriter("OUTPUT.TXT")) {

            fileWriter.write(new BigDecimal(E).setScale(scanner.nextInt(), RoundingMode.HALF_UP).toString());

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
