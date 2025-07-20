import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the password checker!\n");

        String password;
        do{
            System.out.println("Enter your password: ");
            password = input.next();
        } while (!isValidPassword(password));
            System.out.println("Thanks for entering your password, you have successfully logged in!");
    }


    public static boolean isValidPassword(String password) {
        return password.length() >= 5;
    }
}
