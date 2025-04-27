import java.util.Scanner;

public class compoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.println("Welcome to compound Interest calculator");

        System.out.println("Please enter the Principal Amount: ");
        int principal = input.nextInt();

        System.out.println("Please enter the Rate of Interest");
        float rate = input.nextFloat();

        System.out.println("Please enter the Time Period");
        float time = input.nextFloat();

        double compoundInterest = (principal * Math.pow(1 + (rate / 100), time));
        System.out.println("Compound Interest is: " + compoundInterest);
    }
}
