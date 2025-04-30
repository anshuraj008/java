import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Factorial Program");
        System.out.println("Enter a number to find its factorial: ");
        int num = sc.nextInt();
        long fact = factorial(num);
        System.out.println("The factorial of " + num + " is " + fact);
    }

    public static long factorial(int num) {
        if (num<2){
    return 1;
    }
    long fact = 1;
    int i = 2;
    while (i<=num);{
    fact = fact * i;
    i++;
    }
    return fact;
    }
}


