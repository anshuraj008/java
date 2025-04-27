import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to our Calculator");

        System.out.print("Please enter first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Please enter second number: ");
        int secondNumber = input.nextInt();

        int sum = firstNumber + secondNumber;

        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + sum);
    }
}
