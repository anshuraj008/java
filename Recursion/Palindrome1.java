import java.util.Scanner;

public class Palindrome1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Palindrome Checker Program\nEnter a word: ");
        String word = input.next();
        System.out.println("Your String is " + 
                            ((isPalindrome(word) ? "Palindrone"
                                                  : "Not Palindrone")));
    }

    public static boolean isPalindrome(String word) {
        if (word.length() <= 1) {
            return true;
        }
        int lastPos = word.length() - 1;
        if(word.charAt(0) != word.charAt(lastPos)) {
            return false;
        }
        return isPalindrome(word.substring(1, lastPos));
    }
}
