import java.util.*;

public class SlidingWindowMax {
    static class Pair implements Comparable<Pair>{
        int val;
        int idx;

        public Pair(int val, int idx){
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair other) {
            //descing order
            return other.val - this.val; // Max-heap based on val
        }
    }
    public static void main(String[] args) { // O(nlogk)
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k = 3; // window size
        int result[] = new int [arr.length - k + 1];

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        // first window
        for(int i=0; i<k; i++){
            pq.add(new Pair(arr[i], i));
        }

        result[0] = pq.peek().val;

        // remaining windows
        for(int i=k; i<arr.length; i++){
            // remove elements not in window
            while(!pq.isEmpty() && pq.peek().idx <= i - k){
                pq.remove();
            }

            // add new element
            pq.add(new Pair(arr[i], i));

            // get max for current window
            result[i - k + 1] = pq.peek().val;
        }

        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
