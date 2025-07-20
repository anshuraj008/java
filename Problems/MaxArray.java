import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to the MaxArray program!\n");

        int[] arr = ArrayUtility.inputArray();

        int max = Integer.MIN_VALUE;
        for (int num: arr){
             if(max < num){
                max = num;
            }
        }
        
        System.out.println("The maximum value in the array is: " + max);
    }
}
