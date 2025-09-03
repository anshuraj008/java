public class PowerFunction {
    public static void main(String[] args) {
        System.out.println(power(2,5));
    }

    public static int power(int x, int n) {
        if(n == 0) {
            return 1;
        }

        //int xN = x * power(x,n-1);  shortcut
        int xNMinus1 = power(x, n-1);
        int xN = x * xNMinus1;
        return xN;
    }
}
