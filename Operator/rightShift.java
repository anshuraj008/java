import java.util.Scanner;

public class rightShift {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to showcase of Right shift operator");

        System.out.println("Enter the number");
        int num = sc.nextInt();

        int result = num >> 1;
        System.out.println("The result is " + result);
    }
}