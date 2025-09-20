import java.util.*;

public class MaxReactangular {
    public static void maxArea(int arr[]){//O(n)
        int maxArea = 0;
        int nsr[] = new int[arr.length]; //Next Smaller Right
        int nsl[] = new int[arr.length]; //Next Smaller Left

        //Next Smaller Right
        Stack<Integer> s = new Stack<>();

        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){ //pop all greater or equal elements than arr[i] in stack
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length; 
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        //Next Smaller Left
        s = new Stack<>();

        for(int i=0; i<arr.length; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){ //pop all greater or equal elements than arr[i] in stack
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //Current Area = hight * width
        //width = nsr[i] - nsl[i] - 1 = j-i-1
        for(int i=0; i<arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }
        System.out.println("Max Area in Histogram is: " + maxArea);

    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3}; //heights in histogram
        maxArea(arr);
    }
}
