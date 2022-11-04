package jul18;

import Square.Square;

import java.util.Arrays;
import java.util.LinkedList;

public class List {
    private int[] array = new int[10];
    private int count = 0;

    public void add(int num, int index) {
        if (index >= array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[index] = num;
    }


    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    public int get(int index) {
        return array[index];

    }


    public void add(Square square1) {
    }
}


