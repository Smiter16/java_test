package jul18;

public class App {
    public static void main(String[] args) {
        List list = new List();


        list.add(0, 5);
        list.add(1,1);
        list.add(2,2);
        list.add(10,3);
        list.add(11,4);
        list.add(8,5);
        list.add(9,6);
        list.add(10,7);
        list.add(11,8);
        list.add(8,9);
        list.add(9,10);
        list.add(444, 15);

        list.get(5);
        System.out.println(list.toString());
    }
}
