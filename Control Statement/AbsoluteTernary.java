import java.util.Scanner;

public class AbsoluteTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Absolute Ternary program!\n");

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        int result = num >= 0 ? num : -num;
        System.out.println("Absolute value is: " + result);
    }
}
