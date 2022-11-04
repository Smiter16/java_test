import java.util.HashSet;

public class Test01_08 {
    public static void main(String[] args) {

        HashSet<Integer> hset = new HashSet<>();
        hset.add(108);
        hset.add(211);
        hset.add(301);
        hset.add(404);
        hset.add(10);
        hset.add(22);
        hset.add(33);
        hset.add(44);
        hset.add(1);
        hset.add(2);

        System.out.println(hset.toString());
    }
}
