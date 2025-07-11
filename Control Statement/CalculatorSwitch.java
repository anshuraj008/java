import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Calculator\n");

        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.println("Now, enter the operator:");
        String operation = input.next();

        int result = switch (operation) {
            case "+"
                -> num1 + num2;
            case "-"
                -> num1 - num2;
            case "*"
                -> num1 * num2;
            case "/"
                -> num1 / num2;
            default ->  -1; 
        };
        System.out.println("Result: " + result);
    }
}


