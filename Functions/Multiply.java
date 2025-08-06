public class Multiply {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int prod = Multiplication(a,b);
        System.out.println("a * b: " + prod);

         prod = Multiplication(6,8);
         System.out.println("a * b: " + prod);
    }

    public static int Multiplication(int a, int b) {
        int product = a * b;
        return product;
    }
}
