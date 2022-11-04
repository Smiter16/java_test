public class Test10_06 {
    public static void main(String[] args) {
        int[] arr = {11, 12, 2, 4, 15, 6, 7, 8, 9, 10};
        int sum = 0;
        int count = 0;
        int sr = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            count = i + 1;
            sr = sum / count;

        }
//        System.out.println(sum);
//        System.out.println(sr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < sr){
                System.out.println(arr[i]);
            }
        }
    }
}
