import java.util.Scanner;

public class logical {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Ticket Discount Calculator");
        
        System.out.println("Enter your age:");
        int age = input.nextInt();

        System.out.println("Are you a female? (true/false): ");
        boolean isFemale = input.nextBoolean();

        if (age < 5) {
        System.out.println("You are eligible for a 80% discount.");
        } else if (isFemale) {
            System.out.println("You are eligible for a 50% discount.");
        }  else if (age > 60 && !isFemale) {
            System.out.println("You are eligible for a 20% discount.");
        } else {
            System.out.println("You are not eligible for a discount.");
        }
    }
}
