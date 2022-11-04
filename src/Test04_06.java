public class Test04_06 {
    public static void main(String[] args) {
        int count = 0;
        int num = 100;

        while (count <= 15) {
            if (num % 19 == 0) {
                System.out.println(count + ". " + num);
                count++;
            }
            num++;
        }
    }
}
