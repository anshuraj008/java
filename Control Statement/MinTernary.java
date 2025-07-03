import java.util.Scanner;

public class MinTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the MinTernary program!\n");

        System.out.println("Enter a first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter a second number: ");
        int num2 = input.nextInt();

        MinTernary ternary = new MinTernary();
        int min = ternary.min(num1, num2);
        System.out.println("The minimum number is: " + min);
    }

    public int min(int num1, int num2){

        return num1 < num2 ? num1 : num2;
        
        // if(num1 < num2){
        // return num1;
        // } else {
        // return num2;
        // }
    }
}
