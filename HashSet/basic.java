import java.util.*;

public class basic {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);
        set.add(1);
        set.add(5);

        System.out.println(set);
        System.out.println(set.size());

        if(set.contains(2)) {
            System.out.println("set contains 2");
        }
        set.remove(5);
        if(set.contains(5)) {
            System.out.println("set contains 5");
        }
        System.out.println(set.size());
    }
}
