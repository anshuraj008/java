public class FunOverloading {
    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(3,5,8));
        System.out.println(sum(4.2f, 7.6f));
    }

    //Function name same but parameter different
    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    //function returnType different and parameter also different
    public static float sum(float a, float b){
        return a+b;
    }
}
