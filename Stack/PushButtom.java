import java.util.*;

public class PushButtom {
    public static void PushButtom(Stack<Integer> s1, int data){
        if(s1.isEmpty()){
            s1.push(data);
            return;
        }
        int top = s1.pop();
        PushButtom(s1, data);
        s1.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);

        PushButtom(s1, 5);
        while(!s1.isEmpty()){
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}
