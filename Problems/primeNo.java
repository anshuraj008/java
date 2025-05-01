import java.util.Scanner;

public class primeNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to prime number checker");
        
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        boolean isPrime = isPrime(num);
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        sc.close();
    }

    public static boolean isPrime (int num) {
        int i = 2;
        while (i <= num - 1) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
