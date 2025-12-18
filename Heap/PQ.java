import java.util.PriorityQueue;
import java.util.Comparator;

public class PQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(5); //0(logn)
        pq.add(1);
        pq.add(3);
        pq.add(4);

        pq1.add(5); //0(logn)
        pq1.add(1);
        pq1.add(3);
        pq1.add(4);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek()); //0(1)
            pq.remove();  //0(logn)
        }

        while (!pq1.isEmpty()) {
            System.out.println(pq1.peek()); //0(1)
            pq1.remove();  //0(logn)
        }
    }
}
