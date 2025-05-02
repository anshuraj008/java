import java.util.Scanner;

public class armstrong {
    
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to he Armstrong Number Program ");
        
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        boolean isArmstrong = isArmstrong(num);
        if(isArmstrong) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }

        public static boolean isArmstrong(int num) {
            int noOfDigits = noOfDigits(num);
            int numCopy = num;
            System.out.println("Number of digits : " + noOfDigits);
            int finalNumber = 0;
            while(num > 0) {
                int lastDigit = num % 10;
                finalNumber = pow(lastDigit, noOfDigits);
                num = num / 10;
            }
            return finalNumber == numCopy;
        }

        public static int pow(int num1, int num2) {
            int result = 1;
            int i = 0;
            while(i < num2) {
                result = result * num1;
                i++;
            }
            return result;
        }

         public static int noOfDigits(int num) {
            int digits = 0;
            while(num > 0) {
                digits++;
                num = num / 10;
            }
            return digits;
        }
}
