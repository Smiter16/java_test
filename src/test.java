import java.util.Scanner;

public class test {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       System.out.println("enter first number:");
       int a = scanner.nextInt();
       System.out.println("enter second number:");
       int b = scanner.nextInt();
       System.out.println("enter third number:");
       int c = scanner.nextInt();

       if (a > b){
           if (c > a){
               System.out.println("Srednee chislo - " + a);
           } else if (c > b){
               System.out.println("Srednee chislo - " + c);
           } else {
               System.out.println("Srednee chislo - " + b);
           }
       } else {
           if (c > b){
               System.out.println("Srednee chislo - " + a);
           } else if (c > a){
               System.out.println("Srednee chislo - " + c);
           } else {
               System.out.println("Srednee chislo - " + b);
           }
       }

    }
}
