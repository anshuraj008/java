import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome tp Multiplication world\n");
        System.out.println("Enter a number to print multiplication table: ");
        int num = input.nextInt();
        printMultiTable(num);
    }

    public static void printMultiTable(int num){
         int i = 1;
         while(i <= 10){
            System.out.println(num + " * " + i + " = " + (num * i));
            i++;
        }
    }
}
