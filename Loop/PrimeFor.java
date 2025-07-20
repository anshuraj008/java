import java.util.Scanner;

public class PrimeFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Prime Number Checker!\n ");
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println("Your number is " + (isPrime(num) ? "prime" : "not prime"));
        
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
            return true;
    }
}
