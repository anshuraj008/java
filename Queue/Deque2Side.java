import java.util.*;

public class Deque2Side {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1); //1
        dq.addFirst(2); //2 1
        dq.addLast(3); //2 1 3
        dq.addLast(4); //2 1 3 4
        System.out.println(dq);

        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq);

        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
    }
}
