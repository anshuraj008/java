import java.util.ArrayList;

public class Basic{
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(1); //0(1)
    list.add(2);
    list.add(3);
    list.add(4);

    list.add(3,9); //add element at index 3 (0(n))
    System.out.println(list);

    //size of the list
    System.out.println(list.size());

    //get element 0(1)
    int element = list.get(2);
    System.out.println(element);

    //delete element
    // list.remove(3);
    // System.out.println(list);
    // }

    //set element
    list.set(1, 5);
    System.out.println(list);

    //element comtains
    System.out.println(list.contains(1));
    System.out.println(list.contains(6));

    //print arraylist
    for (int i = 0; i<list.size(); i++) {
        System.out.print(list.get(i)+ " ");
    }
    System.out.println();


    //Reverse an arraylist - 0(n)
    for (int i = list.size()-1; i >= 0; i--) {
        System.out.print(list.get(i)+ " ");
    }
    System.out.println();
}
}
