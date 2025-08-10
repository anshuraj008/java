import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);

        System.out.println("Length of array = " + marks.length);
        //input
        marks[0] = sc.nextInt(); //phy
        marks[1] = sc.nextInt(); // che
        marks[2] = sc.nextInt(); //math

        //output
        System.out.println("phy : " + marks[0]);
        System.out.println("che : " + marks[1]);
        System.out.println("math : " + marks[2]);

        //update
        marks[1] = 89;
        System.out.println("che :" + marks[1]);

        marks[0] = marks[0] + 1;
        System.out.println("phy :" + marks[0]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage = " + percentage + "%");
    }
}
