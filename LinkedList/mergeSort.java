public class mergeSort {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        public void addFirst(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public void addLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }

        public void print() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }


        public void zigZag() {
            if (head == null || head.next == null) {
                return;
            }

            //find mid
            Node slow = head;
            Node fast = head.next;
            while(fast != null && fast.next != null) {
                slow = slow.next; //+1
                fast = fast.next.next; //+2
            }
            Node mid = slow;

            //reverse 2nd half
            Node curr = mid.next;
            mid.next = null;
            Node prev = null;
            Node next;

            while(curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node left = head;
            Node right = prev;
            Node nextL, nextR;

            //merge in zig-zag fashion
            while(left != null && right != null) {
                nextL = left.next;
                left.next = right;
                nextR = right.next;
                right.next = nextL;

                left = nextL;
                right = nextR;
            }
        }
    }


        private static Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow; //mid node
    }

    private static Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public static Node mergeSorting(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        //find mid
        Node mid = getMid(head);
        //left and right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSorting(head);
        Node newRight = mergeSorting(rightHead);

        //merge
        return merge(newLeft, newRight);
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        
        // Test merge sort
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        //5->4->3->2->1

        System.out.println("Original List:");
        ll.print();
        
        ll.head = mergeSorting(ll.head);
        
        System.out.println("Sorted List:");
        ll.print();

        // Test zig-zag
        LinkedList ll2 = new LinkedList();  // Create new list for zig-zag test
        ll2.addLast(1);
        ll2.addLast(2);
        ll2.addLast(3);
        ll2.addLast(4);
        ll2.addLast(5);
        //1->2->3->4->5

        System.out.println("\nOriginal List for Zig-Zag:");
        ll2.print();
        ll2.zigZag();
        System.out.println("Zig-Zag List:");
        ll2.print();
    }
}
