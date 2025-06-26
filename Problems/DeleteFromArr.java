import java.util.Scanner;

public class DeleteFromArr {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Array Deletion Program\n");
        int[] numArr = ArrayUtility.inputArray();

        System.out.print("Enter the number you want to delete: ");
        int numToDelete = input.nextInt();

        int[] newArr = deleteNumber(numArr, numToDelete);
        System.out.println("Array after deletion is: ");
        ArrayUtility.displayArray(newArr);
    }

    public static int[] deleteNumber(int[] numArr, int numToDelete) {
        int occ = occurrencesArr.noOfOccurrences(numArr, numToDelete);
        if (occ == 0) {
            return numArr;
        }
        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];

        int i = 0, j = 0;
        while (i < numArr.length) {
            if (numArr[i] != numToDelete) {
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }

        return newArr;
    }
}
