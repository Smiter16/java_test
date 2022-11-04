import java.util.Scanner;

public class Test19_05 {
    public static void main(String[] args) {
// Zadacha na storony treugolnika

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first side:");
        int a = scanner.nextInt();
        System.out.println("enter second side:");
        int b = scanner.nextInt();
        System.out.println("enter third side:");
        int c = scanner.nextInt();

        if (a >= b + c) {
            System.out.println("Forbidden");
        } else if (b >= a + c) {
            System.out.println("Forbidden");
        } else if (c >= a + b) {
            System.out.println("Forbidden");
        } else {
            System.out.println("Yes");
            if (a == b) {
                if (a == c) {
                    System.out.println("Ravnostoronniy");
                } else {
                    System.out.println("Ravnobedrennyy");
                }
            } else {
                if (a == c) {
                    System.out.println("Ravnobed.");
                } else if (b == c) {
                    System.out.println("Ravnobed.");
                } else {
                    System.out.println("Raznostor.");
                }
            }
        }

    }
}
