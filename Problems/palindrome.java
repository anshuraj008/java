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
            int reverse = reverse(num);
            return num == reverse;
        }

        public static int reverse(int num) {
            int newNum = 0;
            while (num > 0) {
                int digit = num % 10;
                newNum = newNum * 10 + digit;
                num /= 10;
            }
            return newNum;
        }
}
