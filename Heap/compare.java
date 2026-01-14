import java.util.PriorityQueue;

public class compare {
    static  class Student implements Comparable<Student>{ // Overriding, Comparable interface
        String name;
        int rank;

        Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank; // Ascending order
    }
}
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("A", 3));
        pq.add(new Student("B", 4));
        pq.add(new Student("C", 2));

        while(!pq.isEmpty()) {
            System.out.println(pq.peek().name +" -> "+ pq.peek().rank);
            pq.remove();
        }
    }
}
