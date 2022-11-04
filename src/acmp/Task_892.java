package acmp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_892 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new FileReader("INPUT.TXT"));
        FileWriter fileWriter = new FileWriter("OUTPUT.TXT")){
            fileWriter.write(getSeason(scanner.nextInt()));
        } catch (IOException e){
            e.printStackTrace();
        }

    }

    public static String getSeason (int number){
        String season;

            switch (number) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Error";
        }
        return season;
    }
}
