package acmp;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_331 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new FileReader("INPUT.TXT"));
             FileWriter fileWriter = new FileWriter("OUTPUT.TXT")) {

            String[] time1 = scanner.nextLine().split(":");
            int hours1 = Integer.parseInt(time1[0]);
            int minutes1 = Integer.parseInt(time1[1]);

            String[] time2 = scanner.nextLine().split(" ");
            int hours2 = Integer.parseInt(time2[0]);
            int minutes2 = Integer.parseInt(time2[1]);

            int hours3 = hours1 + hours2;
            int minutes3 = minutes1 + minutes2;

            if (minutes3 > 59) {
                hours3 += 1;
                minutes3 -= 60;
            }

            while (hours3 > 23) {
                hours3 -= 24;
            }

            String strHours = null;
            String strMinutes = null;

            if (hours3 < 10) {
                strHours = "0" + hours3;
            } else {
                strHours = "" + hours3;
            }

            if (minutes3 < 10) {
                strMinutes = "0" + minutes3;
            } else {
                strMinutes = "" + minutes3;
            }

            fileWriter.write(strHours + ":" + strMinutes);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
