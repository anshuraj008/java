public class Swap {
    public static void main(String[] args) {
        //swap-values exchange
        int a =5;
        int b =10;
         
        swap(a,b);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void swap(int a, int b) { //call by value / copy of main variable
        int temp=a;
        a=b;
        b=temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
