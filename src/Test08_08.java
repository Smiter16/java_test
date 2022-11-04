import java.util.HashSet;
import java.util.Scanner;

public class Test08_08 {
    public static void main(String[] args) {

        HashSet hashSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vvedite kollichestvo chisel:");
        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.println("Vvedite chislo nr " + i + ": ");
            hashSet.add(scanner.nextInt());
        }
        System.out.println(hashSet.toString());

    }
}
