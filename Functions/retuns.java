import java.util.Scanner;

public class retuns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        greet();
        int first = readNumber() + 1;
        int second = readNumber() + 1;

        int sum = first + second;
        System.out.println("Sum of the numbers is: " + sum + "\n");
    }

    public static int readNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        return number;
    }

    public static void greet() {
        System.out.println("Welcome to the calculator program!\n");
    }
}
