

public class BasicBits {
    public static void main(String[] args) {
        System.out.println((5 & 6));  //101 & 110 = 100
        System.out.println((5 | 6));  //101 & 110 = 111
        System.out.println((5 ^ 6));  //101 ^ 110 = 011
        System.out.println(~5);  //Not 5
        System.out.println(5<<2); //Left shift
        System.out.println(6>>1);  //Right shift
    }
}
