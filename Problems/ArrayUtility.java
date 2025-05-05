import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        
        int i = 0;
        while(i < size) {
            System.out.println("Enter element " + (i + 1) + ": ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }
}
