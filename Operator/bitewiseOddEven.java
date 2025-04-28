import java.util.Scanner;

public class bitewiseOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Odd/Even Checker");

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int result = num & 1;
        if (result == 1) {
            System.out.println(num + " is odd.");
        } else {
            System.out.println(num + " is even.");
        }
    }
}
