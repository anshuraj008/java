import java.util.Scanner;
 
public class reverseTheDigit{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Welcome to Reverse the Digit Program\nEnter the number:");
    int num = sc.nextInt();
    int reverse = reverse(num);
    System.out.println("The Reverse of the Number is: " + reverse);
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