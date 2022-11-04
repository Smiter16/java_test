public class Task28_08 {
    public static void main(String[] args) {
        int a = 100;
        int sum = 100;
        int p = 1;
        int count = 0;
        for (int i = 1; i <= 100; i++){
            a = sum * (1 + 1/100);
            count++;
            System.out.println(a);
            System.out.println(count);

            }

        }

}
