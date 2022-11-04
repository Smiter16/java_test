package acmp;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task_550 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new FileReader("INPUT.TXT"));
             FileWriter fileWriter = new FileWriter("OUTPUT.TXT")) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
            fileWriter.write(formatter.format(LocalDate.ofYearDay(scanner.nextInt(), 256)));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
