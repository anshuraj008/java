import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "absc";
        String str2 = new String("jadgd@&m1234");

        // String are IMMUTABLE

        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);

        String fullName = "Anshu raj";
        System.out.println(fullName.length());

        //concatenation
        String firstName = "Anshu";
        String lastName = "Raj";
        String fullName1 = firstName + " " + lastName;
        System.out.println(fullName1.charAt(0));

        printLetter(fullName);
    }

    public static void printLetter(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
}
