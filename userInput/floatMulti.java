import java.util.Scanner;

public class floatMulti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("We are doing Float Multiplication\n");

        System.out.print("Enter first decimal number: ");
        double first = input.nextDouble();

        System.out.print("Enter second decimal number: ");
        double second = input.nextDouble();

        double mul = first * second;

        System.out.println("\nThe multiplication of " + first + " and " + second + " is: " + mul);
        input.close();
    }
}
