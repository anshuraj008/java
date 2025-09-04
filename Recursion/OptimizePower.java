public class OptimizePower {
    public static void main(String[] args) {
        int a = 2;
        int n = 10;
        System.out.println(power(a, n));      
    }

    public static int power(int a, int n) { //0(log n)
        if (n == 0) {
            return 1;
        }
        int halfPower = power(a, n / 2);
        int halfPowersq = halfPower * halfPower;

        //n is odd
        if (n % 2 != 0) {
            halfPowersq = a * halfPowersq;
        }
        return halfPowersq;
    }  
}
