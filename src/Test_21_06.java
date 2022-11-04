public class Test_21_06 {
    public static void main(String[] args) {

        int sum = 0;

            int[][] arr = {{1, 2, 31, 4}, {5, 61, 7, 8}, {39, -10, 11, 32}};
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {

                    if (arr[i][j] >= 30) {
                        sum += arr[i][j];
                    }
                }

            }
            System.out.println(sum);


        if (sum == 163) {
            throw new RuntimeException("163 ha ha");
        }
    }
}