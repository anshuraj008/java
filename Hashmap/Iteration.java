import java.util.*;

public class Iteration {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("India", 150);
        map.put("china", 200);
        map.put("USA", 100);
        map.put("UK", 50);
        map.put("Germany", 80);

        // Iterate
        Set<String> keys = map.keySet();
        System.out.println(keys);

        for (String k : keys) { // Foreach loop
            System.out.println("key=" + k + ",value=" + map.get(k));
         }
    }
}
