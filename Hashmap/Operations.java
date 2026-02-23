import java.util.HashMap;

public class Operations {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("India", 150);
        map.put("china", 200);
        map.put("USA", 100);

        System.out.println("HashMap: " + map);

        //Get - 0(1)
        int population = map.get("India");
        System.out.println("Population of India: " + population);
        System.out.println("Population of Pakistan: " + map.get("Pakistan"));

        //ContainsKey - 0(1)
        System.out.println(map.containsKey("India")); // true
        System.out.println(map.containsKey("Pakistan")); // false

        //Remove - 0(1)
         System.out.println("Removing USA: " + map.remove("USA"));
         System.out.println("HashMap after removing USA: " + map);

        //Size - 0(1)
        System.out.println("Size of HashMap: " + map.size());

        //Is Empty - 0(1)
        map.clear();
        System.out.println("Is HashMap empty? " + map.isEmpty());
    }
}
