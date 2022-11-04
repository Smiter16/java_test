import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test05_08 {
    public static void main(String[] args) {

        int [] arr = {4, 6, 1, 5, 8,7};

        ArrayList <Integer> list1 = new ArrayList<>(10);

        Arrays.sort(arr);


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



    }
}
