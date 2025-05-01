import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to sum of digits program");
        
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int sum = sumOfDigit(num);
        System.out.println("Sum of Digits is: " + sum);
    } 

    public static int sumOfDigit(int num) {
        if (num == 0) {
            return 0;
        }
        return (num % 10) + sumOfDigit(num / 10);
    }

    // public static int sumOfDigit2(int num) {
    //     int sum = 0;
    //     while (num > 0) {
    //         sum += num % 10;
    //         num /= 10;
    //     }
    //     return sum;
    // }
}
