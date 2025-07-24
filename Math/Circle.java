import java.util.Scanner;

public class Circle {

    double radiusInMm;

    Circle(double radiusInMm) {
        this.radiusInMm = radiusInMm;
    }

    double getCircumference() {
        return 2 * radiusInMm * Math.PI;
    }

    double getArea() {
        return Math.PI * Math.pow(radiusInMm, 2);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Circle Props: Radius in mm:"+ radiusInMm 
                            +" , Circumference in mm:"+ getCircumference() 
                            +" , Area in mm2:"+ getArea() 
                            +" ";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Circle Calculator\n");

        System.out.print("Enter Radius in mm: ");
        double radius = input.nextDouble(); 
        Circle circle = new Circle(radius);
        
        System.out.println(circle);
    }
}
