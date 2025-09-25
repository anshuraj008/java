import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        // Example of character array
        char arr[] = {'a', 'b', 'c', 'd'};
        System.out.println("Character array: " + java.util.Arrays.toString(arr));
        
        // Different ways to create strings
        String str = "absc";
        String str2 = new String("jadgd@&m1234");
        System.out.println("String literal: " + str);
        System.out.println("String object: " + str2);

        // String are IMMUTABLE

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            System.out.println("Hello, " + name);

            String fullName = "Anshu raj";
            System.out.println("Full name length: " + fullName.length());

            //concatenation
            String firstName = "Anshu";
            String lastName = "Raj";
            String fullName1 = firstName + " " + lastName;
            System.out.println("First character: " + fullName1.charAt(0));

            System.out.print("Letters in full name: ");
            printLetter(fullName);
        } finally {
            sc.close(); // Always close the Scanner to prevent resource leak
        }
    }

    public static void printLetter(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
}
