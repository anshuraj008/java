import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Welcome to the grade calculator\n");

        System.out.print("Please Enter your percentage: ");
        float percentage = input.nextFloat();
        
        if(percentage >= 90){
          System.out.print(" Great, Your grade is A");
        } else if(percentage >= 80){
            System.out.print(" Good, Your grade is B");
        } else if(percentage >= 70){
            System.out.print(" You are doing well, Your grade is C");
        } else if(percentage >= 60){
            System.out.print(" Work harder next time, Your grade is D");
        } else if(percentage >= 50){
            System.out.print(" you seriously need to work harder, Your grade is E");
        } else {
            System.out.print(" Failed, Your grade is F");
        }
    }
}
