import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Welcome to Palindrome Number Program\nEnter the number:");
        int num = sc.nextInt();

        boolean isPalindrome = isPalindrome(num);
        if (isPalindrome) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }
        sc.close();
        }
    
        public static boolean isPalindrome(int num) {
            int reverse = reverse(num);  // Get the reversed number
            return num == reverse;  // Check if the original number is equal to the reversed number
        }

        public static int reverse(int num) {
            int newNum = 0;  // Initialize newNum to store the reversed number
            while (num > 0) {
                int digit = num % 10;  // Get the last digit of num
                newNum = newNum * 10 + digit;  // Shift the existing digits of newNum to the left and add the new digit
                num /= 10;  // Remove the last digit from num
            }
            return newNum;
        }
}
