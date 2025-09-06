import java.util.ArrayList;
import java.util.Collections;
// import java.util.*;
public class Collection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5); //0(1)
        list.add(4);
        list.add(3);
        list.add(7);

        System.out.println(list);
        Collections.sort(list); //ascending order
        System.out.println(list);

        //descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
