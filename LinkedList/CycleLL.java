public class CycleLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static Node head;

    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        //1->2->3->2
        
        // Example: Create a cycle by connecting last node to first node
        // Uncomment below line to test cycle detection
        // head.next.next.next = head;
        //1->2->3->1
        
        System.out.println("Has cycle: " + hasCycle());
        removeCycle();
        System.out.println("Has cycle after removal: " + hasCycle());
    }

    public static boolean hasCycle() {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2

            if(slow == fast) {
                return true; //cycle exists
            }
        }
        return false; //cycle does not exist
    }


    
    public static void removeCycle() {
        // Detect cycle using Floyd's Tortoise and Hare algorithm
        Node slow = head;
        Node fast = head;
        boolean cycleExists = false;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2

            if(slow == fast){
                cycleExists = true;
                break;
            }
        }
        if(cycleExists == false){
            return; // No cycle
        }

        // Find the starting node of the cycle
        slow = head;
        Node prev = null; // To keep track of the node before the meeting point
        while(slow != fast){
            prev = fast; // Move prev to the node before fast
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the cycle
        prev.next = null; // Break the cycle
    }
}
