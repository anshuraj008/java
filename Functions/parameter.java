public class parameter {
    public static void main(String[] args) {
        int num = sumTwoNumbers(5, 10);  // 5,10 are the arguments
        System.out.println(num);

        System.out.println(sumTwoNumbers(10, 20));

        System.out.println(sumTwoNumbers(5, 10));

        System.out.println(sumTwoNumbers(10, 20));
    }

    public static int sumTwoNumbers(int a, int b) {   //int a, int b are the parameters
        System.out.println("First Number received: " + a);
        System.out.println("Second Number received: " + b);
        int sum = a + b;
        return sum;
    }
}
