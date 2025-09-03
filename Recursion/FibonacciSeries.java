import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to printing Fibonacci Series\n");
        System.out.println("Enter the number of terms: ");
        int count = input.nextInt();

        for (int i=1; i<=count; i++){
            System.out.println(fibonacci(i) + "");
        }
        
        int n = 25;
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n){
        //  if(position == 1 ){
        //     return 0;
        //  }
        //   if(position == 2){
        //     return 1;
        //   }
        //   return fibonacci(position-1) + fibonacci(position-2);

          if(n == 0 || n == 1){
            return n;
          }

          //2 recusive calls
          int f1= fibonacci(n-1);
          int f2 = fibonacci(n-2);
          return f1+f2;
          
    }
}
