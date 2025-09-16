class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList1 {
    public  Node head;
    public  Node tail;
    public int size;

    public void addFirst(int data){
        //step1 = create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step2 = newNode next = head
        newNode.next = head; // link
        //step3 = head = newNode
        head = newNode; 
    }


    public void addLast(int data){
        size++;
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }


    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    //New Node(int data)
    public void add(int idx, int data){
        if(idx == 0){ // add in first and LL is empty
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        //i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //removeFirst
    public int removeFirst(){
        if(size == 0){ // LL is empty
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){ // LL has only one node
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
        

    //removeLast
    public int removeLast(){
        if(size == 0){ // LL is empty
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){ // LL has only one node
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev : i = size-2
        Node prev = head;
        for(int i = 0; i < size - 2; i++){
            prev = prev.next;
        }
        int val = prev.next.data; //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }


    //search key iterative
    public int itrSearch(int key){
        Node temp = head;
        int i =0;

        while(temp != null){
            if(temp.data == key){  //key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        //key not found
        return -1;
    }


    //search key recursive
    public int helper(Node head, int key){  //O(n)
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){ //not found data
            return -1;
        }
        return idx + 1;  // found data
    }

    public int recSearch(int key){
        return helper(head, key);
    }


    //reverse a linked list
    public void reverse(){ //O(n)
        Node prev = null;
        Node curr = tail =  head;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        
    }


    //Delete a node by value
    public void deleteNthfromEnd(int n){
        //calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(n == sz) { //remove first
            head = head.next;
            return;
        }

        //sz - n
        int i =1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind){ //find node to be deleted
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next; //delete
        return;
    
    }


    //Palindrome in LinkedList
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow;  //slow is my midNode
    }


    public boolean isPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        // step1 = find mid
        Node midNode = findMid(head);

        //step2 = reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; //right half head
        Node left = head; //left half head

        //step3 = check left half and right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
}

public class Traversal {
    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addLast(5);
        ll.print();
        ll.add(2, 3);
        ll.print();
        System.out.println(ll.size);
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        
        System.out.println(ll.itrSearch(3));
        System.out.println(ll.itrSearch(10));

        System.out.println(ll.recSearch(3));
        System.out.println(ll.recSearch(10));

        ll.reverse();
        ll.print();

        ll.deleteNthfromEnd(2);
        ll.print(); 

        ll.addLast(3);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(4);
        ll.print();
        System.out.println(ll.isPalindrome());
    }
};