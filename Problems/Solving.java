import java.util.Scanner;

public class Solving {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("welcome to print pattern program");
    System.out.println("enter the number of rows : ");
    int rows = sc.nextInt();
    printFirstPatter(rows);
    }  


    public static void printFirstPatter(int maxRows){
        int rows = 0;
        while(rows < maxRows) {
            System.out.print("*");
            int i = 0;
            while(i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();  // Move to the next line
            rows++;
        }
    }
}
    

