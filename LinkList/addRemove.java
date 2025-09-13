import java.util.LinkedList;

public class addRemove {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(4);
        ll.add(2, 3); //index, value

        System.out.println(ll);

        //remove
        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }
}
