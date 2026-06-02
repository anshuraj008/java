// public class Palindrome {
//     public static void main(String[] args) {
//         String str = "racecar";
//         System.out.println(isPalindrome(str));
//     }

//     public static boolean isPalindrome(String str){
//         for(int i=0; i<str.length()/2; i++){
//             int n = str.length();
//             if(str.charAt(i) != str.charAt(n-1-i)){
//                //not a palindrome
//                return false;
//             }
//         }
//         return true;
//     }
// }

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        String str = "madam";

        int left = 0;
        int right = str.length() - 1;

        boolean palindrome = true;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                palindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println(
            palindrome ? "Palindrome" : "Not Palindrome"
        );
    }
}
