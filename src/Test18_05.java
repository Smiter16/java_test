import java.util.Scanner;

public class Test18_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number:");
        int a = scanner.nextInt();
        System.out.println("enter second number:");
        int b = scanner.nextInt();

        if (b != 0) {
            int res = a / b;
            int ost = a % b;

            if (ost == 0) {
                System.out.println("Chastnoe " + res);
            } else {
                System.out.println("Chastnoe " + res + ", Ostatok 5" + ost);
            }
        } else {
            System.out.println("Wy delite na 0!");
        }

    }
}