public class Test06_06 {
    public static void main(String[] args) {
        int num = 97286;

        int max = 0;
        while (num!=0) {
            int curLast = num % 10;
            if (max < curLast) {
                max = curLast;
            }
            num/=10;
        }
        System.out.println(max);
    }
}
