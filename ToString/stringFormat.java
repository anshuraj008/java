public class stringFormat {
    public static void main(String[] args) {
        String name = "Anshu Raj";
        int marks = 123450;
        System.out.println("Hello " + name + ", Your marks are: " + marks);

        System.out.printf("Hello %s, Your marks are: %d\n", name, marks);

        System.out.printf("Hello %S, Your marks are: %d\n", name, marks);

        System.out.printf("Hello %20S, Your marks are: %d\n", name, marks);
        System.out.printf("Hello %-20S, Your marks are: %d\n", name, marks);
        System.out.printf("Hello %20S, Your marks are: %0,5d", name, marks);
    }
}
