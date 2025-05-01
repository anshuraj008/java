import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to he LCM ");
        
        System.out.println("Enter a number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter a number : ");
        int num2 = sc.nextInt();

        int lcm = lcm(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
        sc.close();
    } 

    public static int lcm(int num1, int num2) {
        int i = 1;
        while(true) {
            int factor = num1 * i;
            if (factor % num2 == 0) {
                return factor;
            }
            i++;
        }
    }

}
