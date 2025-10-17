import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // int i = 1;
        // while (i <= 100) {
        //      System.out.println(i + "");
        //      i++;
        // }

        for (int i = 0; i <= 100; i++) {
            System.out.println(i + "");
        }
        input.close();
    }
}
