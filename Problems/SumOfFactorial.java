import java.util.Scanner;

public class SumOfFactorial { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to factorial sum");
        System.out.println("enter the number");
        int num = sc.nextInt();
        long result = factorial(num);
        System.out.println("the sum of the factorial is " + result);
    }

    public static long factorial(int num){
        if(num <= 2) {
            return 1;
        }
        long fact = 1;
        int i = 2;
        while(i <= num){
            fact *= i;
            i ++;
        }
        return fact;
    }

}
