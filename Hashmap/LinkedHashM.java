import java.util.*;

public class LinkedHashM {
    public static void main(String[] args) { //0(1)
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 150);
        lhm.put("china", 200);
        lhm.put("USA", 100);

        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 150);
        map.put("china", 200);
        map.put("USA", 100);

        System.out.println(lhm);
        System.out.println(map);
    }
}
