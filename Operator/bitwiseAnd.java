import java.util.Scanner;

public class bitwiseAnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Showcasing Bitwise And operator\n");

        System.out.print("Enter First Number: ");
         int num1 = input.nextInt();

        System.out.print("Enter Second Number: ");
         int num2 = input.nextInt();   

        int result = num1 & num2;
        System.out.println("Result of Bitwise And operator: " + result);
         input.close();
    }
}
