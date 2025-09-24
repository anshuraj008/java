

public class Implementation {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        //add
        public static void add(int data){
            if(rear == size-1){
                System.out.println("Queue is full");
                return;
            }

            rear++;
            arr[rear] = data;
        }

        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            int front = arr[0];
            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        Queue.add(1);
        Queue.add(2);
        Queue.add(3);
        
        System.out.println("Initial queue:");
        System.out.println("Front element: " + Queue.peek()); // Shows 1
        
        // Remove only the first element (1)
        int removed = Queue.remove();
        System.out.println("Removed element: " + removed); // Shows 1
        
        System.out.println("Queue after removing element 1:");
        // Now the queue contains [2, 3]
        while(!Queue.isEmpty()){
            System.out.println(Queue.peek());
            Queue.remove();
        }
    }
}
