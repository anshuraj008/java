import java.util.Scanner;

public class arrrSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 7, 10, 60, 39, 24, 18, 59, 4};
        System.out.println("Welcome to Array Search Program\n");

        System.out.println("Enter the element you want to search: ");
        int num = sc.nextInt();

        boolean isFound = isFound(arr, num);
        if(isFound) {
            System.out.println("Element found in the array!");
        } else {
            System.out.println("Element not found in the array!");
        }   
    }

    public static boolean isFound(int[] arr, int num) {
        int index = 0;
        while(index < arr.length) {
            if(arr[index] == num) {
                return true;
            }
            index++;
        }  
        return false;
    }
}
