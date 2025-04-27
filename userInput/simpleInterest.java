import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to simple Interest calculator");

        System.out.println("Please enter the Principal Amount: ");
        int principal = input.nextInt();

        System.out.println("Please enter the Rate of Interest");
        float rate = input.nextFloat();

        System.out.println("Please enter the Time Period");
        float time = input.nextFloat();

        float simpleInterest = (principal * rate * time) / 100;
        
        System.out.println("\nThe simple interest is " + simpleInterest);
    }
}
