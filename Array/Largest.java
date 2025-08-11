import java.util.*;

public class Largest {
    public static void main(String[] args) {
        int numbers[] = {1,3,9,19,7,5,69};
        System.out.println("largest value is : " + getLargest(numbers)); 
    }
    
    
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;  // -infinity
        int smallest = Integer.MAX_VALUE; // infinity

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is : " + smallest);
        return largest;
    }
}
