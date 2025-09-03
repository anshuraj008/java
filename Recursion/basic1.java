import java.util.Scanner;

public class basic1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to factorial  generator\n");

        System.out.println("Please enter the number to generate factorial: ");
        int num = input.nextInt();

        long fact = factorial(num);
        // long fact = factorialIterative(num);
        System.out.println("Factorial of " + num + " is " + fact);
    }

    //Recursive function
    public static long factorial(int num){
        System.out.println("Function call: " + num);
        
        if(num == 0){
            return 1;
        }
        return num * factorial(num - 1);
    }

    //loop function
    // public static long factorialIterative(int num) {
    //     long result = 1;
    //     for (int i = 1; i <= num; i++) {
    //         result *= i;
    //     }
    //      return result;
    // } 
}
