import java.util.Scanner;

public class fahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Temperature Converter");
        
        System.out.print("Enter the temperature in Fahrenheit: ");
        float fahrenheit = input.nextFloat();

        float celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("Temperature in Celsius: " + celsius + "C");
    }
}
