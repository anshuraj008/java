import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum1 = calculateSum(a,b); //arguments or actual parameters  / Some value
        System.out.println("sum is: " + sum1);
    }

    public static int calculateSum(int num1, int num2) { //parameters or formal parameters / No value
        int sum = num1 + num2;
        return sum;
    }
}
