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
    }
};