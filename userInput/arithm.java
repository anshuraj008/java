import java.util.Scanner;

public class arithm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Arithmetic calculator!\n");
        
        System.out.println("Please enter the first number: ");
        int first = input.nextInt();
        
        System.out.println("Please enter the second number: ");
        int second = input.nextInt();
        
        int add = first + second;
        int sub = first - second;
        int mul = first * second;
        int div = first / second;
        int mod = first % second;

        System.out.println("The sum of the two numbers is: " + add);
        System.out.println("The difference of the two numbers is: " + sub);
        System.out.println("The product of the two numbers is: " + mul);
        System.out.println("The quotient of the two numbers is: " + div);
        System.out.println("The remainder of the two numbers is: " + mod);
        
        


    }
}
