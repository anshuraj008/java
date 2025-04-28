import java.util.Scanner;

public class bitewiseXor {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Showcasing Bitwise XOR operator\n");

        System.out.print("Enter First Number: ");
         int num1 = input.nextInt();

        System.out.print("Enter Second Number: ");
         int num2 = input.nextInt();   

        int result = num1 ^ num2;
        System.out.println("Result of Bitwise XOR operator: " + result);
         input.close();
    }
}
