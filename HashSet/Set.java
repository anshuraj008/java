import java.util.*;

public class Set {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
    
        cities.add("Jharkhand");
        cities.add("Bihar");
        cities.add("West Bengal");
        cities.add("Odisha");
        cities.add("Chhattisgarh");
        cities.add("Madhya Pradesh");
        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
    
        lhs.add("Jharkhand");
        lhs.add("Bihar");
        lhs.add("West Bengal");
        lhs.add("Odisha");
        lhs.add("Chhattisgarh");
        lhs.add("Madhya Pradesh");
        System.out.println(lhs);
        lhs.remove("Bihar");
        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Jharkhand");
        ts.add("Bihar");
        ts.add("West Bengal");
        ts.add("Odisha");
        ts.add("Chhattisgarh");
        ts.add("Madhya Pradesh");
        System.out.println(ts);
    }
}
