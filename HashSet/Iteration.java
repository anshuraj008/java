import java.util.*;

public class Iteration {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Jharkhand");
        cities.add("Bihar");
        cities.add("West Bengal");
        cities.add("Odisha");
        cities.add("Chhattisgarh");
        cities.add("Madhya Pradesh");

        // Iterator itr = cities.iterator();
        // while(itr.hasNext()) {
        //     System.out.println(itr.next());
        // }

        //Advanced for loop (for-each loop)
        for(String city : cities){
            System.out.println(city);
        }
    }
}
