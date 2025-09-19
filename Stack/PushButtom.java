import java.util.*;

public class PushButtom {
    public static void pushBottom(Stack<Integer> s1, int data){
        if(s1.isEmpty()){
            s1.push(data);
            return;
        }
        int top = s1.pop();
        pushBottom(s1, data);
        s1.push(top);
    }

    public static void reverseStack(Stack<Integer> s1){
        if(s1.isEmpty()){
            return;
        }
        int top = s1.pop();
        reverseStack(s1);
        pushBottom(s1, top);
    }

    public static void printStack(Stack<Integer> s1){
        while(!s1.isEmpty()){
            System.out.println(s1.pop());
        }
    }

    public static String reverseString(String str){
        Stack<Character> s2 = new Stack<>();
        int idx = 0;
        while(idx<str.length()){
            s2.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!s2.isEmpty()){
            char curr = s2.pop();
            result.append(curr);
        }
        return result.toString();
    }
  
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        //30,20,10

        reverseStack(s1);
        printStack(s1);
        //10,20,30

        pushBottom(s1, 5);
        while(!s1.isEmpty()){
            System.out.println(s1.peek());
            s1.pop();
        }

        String str = "abcd";
        String result = reverseString(str);
        System.out.println(result);

    }
}
