import java.util.*;

public class Map {
    public static void main(String[] args) { //0(1)
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 150);
        lhm.put("China", 200);
        lhm.put("USA", 100);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 150);
        hm.put("China", 200);
        hm.put("USA", 100);

        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 150);
        tm.put("China", 200);
        tm.put("USA", 100);

        System.out.println(lhm);
        System.out.println(hm);
        System.out.println(tm);
    }
}
