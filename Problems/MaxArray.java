// import java.util.Scanner;

// public class MaxArray {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Welcome to the MaxArray program!\n");

//         int[] arr = ArrayUtility.inputArray();

//         int max = Integer.MIN_VALUE;
//         for (int num: arr){
//              if(max < num){
//                 max = num;
//             }
//         }
        
//         System.out.println("The maximum value in the array is: " + max);
//     }
// }


public class MaxArray {
    public static void main(String[] args) {

        int[] arr = {12, 45, 7, 89, 23};

        int max = arr[0];
        int min = arr[0];

        // Find maximum and minimum
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum element = " + max);
        System.out.println("Minimum element = " + min);
    }
}