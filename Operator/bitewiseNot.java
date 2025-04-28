import java.util.Scanner;

public class bitewiseNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to showcase of NOT/Compliment operator");

        System.out.println("Enter the number");
        int num = sc.nextInt();

        int result = ~num;
        
        System.out.println("The result is " + result);
    }
}
