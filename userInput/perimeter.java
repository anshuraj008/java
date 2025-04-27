import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the perimeter calculator");

        System.out.println("Please enter all 4 sides in cms: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        double side4 = input.nextDouble();

        double perimeter = side1 + side2 + side3 + side4;

        System.out.println("The perimeter of the rectangle is " + perimeter + " cms");
    }
}
