import java.util.Scanner;

public class triangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to area calculator\n");

        System.out.println("please enter your base in cms: ");
        double base = input.nextDouble();

        System.out.println("Now, enter your perpendicular height in cms: ");
        double height = input.nextDouble();
        
        //double area = (base * height) / 2; 
        double area = 0.5 * base * height; // 0.5 is the formula for the area of a triangle

        System.out.println("Your triangle area is: " + area + " cms2");
    }
}
