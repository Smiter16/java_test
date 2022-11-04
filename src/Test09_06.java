public class Test09_06 {
    public static void main(String[] args) {

        int[] arr = {140, 52, 58, 23, 20, 53, 46, 35, 32, 7}; // 35, 32, 7 23, 20, 53, 46, 140, 52, 58

        int preMax = 0;
        int max = 0;


        for (int i = 0; i < 3; i++) {

        int startIndex = i;
        int endIndex = arr.length-3 + i;

        int temp = arr[startIndex];
        arr[startIndex] = arr[endIndex];
        arr[endIndex] = temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
