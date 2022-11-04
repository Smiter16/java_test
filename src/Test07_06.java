public class Test07_06 {
    public static void main(String[] args) {

        int[] arr = {140, 52, 58, 23, 20, 53, 46, 35, 32, 7};

        int preMax = 0;
        int max = 0;

        System.out.println(preMax);

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                preMax = max;
                max = arr[i];
           } else if (arr[i] > preMax) {
               preMax = arr[i];
            }

        }
        System.out.println("Max - " + max + " PreMax - " + preMax);
    }
}
