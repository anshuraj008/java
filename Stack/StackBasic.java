import java.util.ArrayList;
import java.util.*;

public class StackBasic {

    static class ArrayLStack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        //push
        public static void push(int data){
            list.add(data);
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    //linked list implementation
    static class LLNode{
        int data;
        LLNode next;
        LLNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class LLStack{
        static LLNode head;
        public static boolean isEmpty(){
            return head == null;
        }
        //push
        public static void push(int data){
           LLNode newNode = new LLNode(data);

           if(isEmpty()){
               head = newNode;
                return;
            }
           newNode.next = head;
           head = newNode;
        }
        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
       

    public static void main(String[] args) {
        ArrayLStack s = new ArrayLStack();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }


        LLStack s2 = new LLStack();
        s2.push(1);
        s2.push(2);
        s2.push(3);
        s2.push(4);
        while(!s2.isEmpty()){
            System.out.println(s2.peek());
            s2.pop();
        }


        Stack<Integer> s3 = new Stack<>();
        s3.push(10);
        s3.push(20);
        s3.push(30);
        s3.push(40);
        while(!s3.isEmpty()){
            System.out.println(s3.peek());
            s3.pop();
        }
    }
}
