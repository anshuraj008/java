import java.util.Scanner;

public class Search2DArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");

        int[][] numArr = ArrayUtility.input2DArray();

        System.out.println("Now enter the number to be searched: ");
        int num = input.nextInt();

        boolean isFound = search(numArr, num);
        if(isFound) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }
    }

    public static boolean search(int[][] numArr, int num) {
        int i = 0;
        while (i < numArr.length) {
            int j = 0;
            while (j < numArr[i].length) {
                if (numArr[i][j] == num) {
                    return true;
                }
                j++;
            }
            i++;
        }
        // if the loop is not broken, return false (number not found
        return false;
    }
}
