import java.util.Scanner;

public class OccurrencesForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to finding the occurence\n ");

        int[] nums = ArrayUtility.inputArray();
        System.out.println("Now, enter the number you want to find the occurence: ");
        int element = input.nextInt();

        int occ = countOccurence(nums, element);
        System.out.println("The number " + element + " has occured " + occ + " times");

    }

    public static int countOccurence(int[] nums, int element) {
        int occ = 0;
        for (int num : nums) {
            if (num == element)
                occ++;
        }
        return occ;
    }
}
