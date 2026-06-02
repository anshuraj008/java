public class PalindromeElements {

    static boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;

        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {

        int[] arr = {129, 131, 44};

        boolean allPalindrome = true;

        for (int num : arr) {
            if (!isPalindrome(num)) {
                allPalindrome = false;
                break;
            }
        }

        System.out.println(
            allPalindrome ? "All Palindrome" : "Not All Palindrome"
        );
    }
}
