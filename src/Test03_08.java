import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Test03_08 {
    public static void main(String[] args) {

        TreeMap<String, Integer> hhhMap = new TreeMap<>();
        hhhMap.put("Green", 1);
        hhhMap.put("Yellow", 2);
        hhhMap.put("Blue", 3);

        Collection <Integer> values = hhhMap.values();
        for (Integer inte: values) {
            System.out.println(inte);
        }



    }
}
