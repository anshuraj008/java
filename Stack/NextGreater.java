import java.util.*;

public class NextGreater {
    public static void main(String[] args) { //0(n)
        int arr[] = {6, 8, 0, 1, 3};
        int nextGreater[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        for(int i=arr.length-1; i>=0; i--){
            int curr = arr[i];
            while(!s.isEmpty() && curr >= arr[s.peek()]){  //pop all smaller or equal elements than curr in stack
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }

        for(int i=0; i<nextGreater.length; i++){
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();

        //next Greater Right
        //next Greater Left
        //next Smaller Right
        //next Smaller Left
    }
}
