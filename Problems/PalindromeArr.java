public class PalindromeArr {
    public static void main(String[] args) {
        System.out.println("Welcome tp polindrome Checker\n");
        int[] numArr = ArrayUtility.inputArray();

        boolean isPalindrome = isPalindrome(numArr);

        if (isPalindrome) {
            System.out.println("The array is a palindrome");
        } else {
            System.out.println("The array is not a palindrome");
        }
    }

    public static boolean isPalindrome(int[] numArr) {
        int i = 0;
        while (i < numArr.length / 2) {
            if (numArr[i] != numArr[numArr.length - 1 - i]) { 
                return false;
            }
            i++;
        } 
        return true; 
    }
}
