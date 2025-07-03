import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number checker\n");
        System.out.println("Please enter your first number: ");
        int num1 = input.nextInt();
        System.out.println("Now , enter your second number: ");
        int num2 = input.nextInt();

        // if(num1 > num2) {
        //     System.out.println(num1 + " is greater than " + num2);
        // } else {
        //     System.out.println(num2 + " is greater than " + num1);
        // }


        // int greaterNumber;
        // if(num1 > num2) {
        //     greaterNumber = num1;
        // } else {
        //     greaterNumber = num2;
        // }
        // System.out.println("The greater number is " + greaterNumber);

        
        // Ternary Operator
        int greaterNumber2 = num1 > num2 ? num1 : num2;
        System.out.println("The greater number is " + greaterNumber2);
    }    
}
