import java.util.Scanner;

public class StuScoreTernary {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Student Score Ternary program!\n");

        System.out.println("Enter a marks: ");
        int marks = input.nextInt();

        String result = (marks >= 80) ? "High" : (marks <= 50) ? "Moderate" : "Low";
        System.out.println("The student's result is: " + result);
    }
}
