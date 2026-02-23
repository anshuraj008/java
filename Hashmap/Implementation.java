import java.util.*;

public class Implementation {
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; //n
        private int N;
        private LinkedList<Node> buckets[]; //N = buckets.length
        
        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int findInBucket(int bi, K key) {
            LinkedList<Node> bucket = buckets[bi];
            int di = 0;

            for (int i = 0; i < bucket.size(); i++) {
                Node node = bucket.get(i);
                if (node.key.equals(key)) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBuckets[] = buckets;
            buckets = new LinkedList[2 * N];
            N = 2 * N;
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            // nodes -> add in new bucket
            for (int i = 0; i < oldBuckets.length; i++) {
                LinkedList<Node> bucket = oldBuckets[i];
                for (int j = 0; j < bucket.size(); j++) {
                    Node node = bucket.remove(); // remove node from old bucket
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key); // bucket index 0 to 3
            int di = findInBucket(bi, key); // valid; -1 if not found
                
            if(di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double)n / N;
            if(lambda > 2.0){
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = findInBucket(bi, key);
            
            if(di != -1) { // valid
                return true;
            } else {
                return false;
            }
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = findInBucket(bi, key);
             
            if(di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else {
            return null;
            }
        }

        public V get(K key) {
            int bi = hashFunction(key); // bucket index 0 to 3
            int di = findInBucket(bi, key); // valid; -1 if not found
                
            if(di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
             
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> bucket = buckets[i];
                for (int j = 0; j < bucket.size(); j++) {
                    keys.add(bucket.get(j).key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("India", 150);
        map.put("china", 200);
        map.put("USA", 100);
        map.put("Nepal", 50);

        ArrayList<String> keys = map.keySet();
        for (String key : keys) {
        System.out.println(key);
        }

        System.out.println(map.get("India"));
    }
}
