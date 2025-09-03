public class naturalNumber {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(calSum(n));
    }

    public static int calSum(int n){
        if(n==1){
            return 1;
        }
        
        //buttom to top in stack recurision
        //so we have to call the function first and then return the 
        int sum1 = calSum(n-1);
        //and then return the sum during top to bottom of stack
        int sum2 = n + sum1;
        return sum2;
    }
}
