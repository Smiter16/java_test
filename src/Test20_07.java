import java.util.ArrayList;
import java.util.LinkedList;

public class Test20_07 {
    public static void main(String[] args) {

        ArrayList <Integer> arrayList = new ArrayList<>();
        arrayList.add(0,3);
        arrayList.add(1,33);
        arrayList.add(2,31);

        LinkedList <Integer> linkedList = new LinkedList<>();

        linkedList.add(0,2);
        linkedList.add(1,4);
        linkedList.add(2,27);
        linkedList.add(3,14);
        linkedList.add(4,20);
        linkedList.add(5,41);
        linkedList.add(6,12);
        linkedList.add(7,15);
        linkedList.add(444);
        linkedList.addAll(arrayList);
        linkedList.addFirst(99);
        linkedList.addLast(98);


//        System.out.println(linkedList);
        for (Integer integer: linkedList) {
            System.out.println(integer);

        }


    }



}
