import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Odd Sum");
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sum = oddSum(num);
        System.out.println("The sum of odd numbers is: " + sum);
    }

    public static int oddSum(int num) {
        int sum = 0;
        int i = 1;
        while(i <= num){
            sum += 1;
            i += 2;
        }
        return sum;
    }    
}
