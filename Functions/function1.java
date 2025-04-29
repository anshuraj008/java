
public class function1 {
    public static void main(String[] args) {

        System.out.println("In main method");
        greetUser(); //Method call
        greetUser();
        System.out.println("Method calling completed");
    }

    public static void greetUser() {
        System.out.println("Hello World!");
    }
}
