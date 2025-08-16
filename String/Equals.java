public class Equals {
    public static void main(String[] args) {
        String s1 = "Anshu";
        String s2 = "Raj";
        String s3 = new String("Anshu");

        if(s1 == s2){ //value checking
            System.out.println("Strings are equals");
        } else {
            System.out.println("String are not equal");
        }

        if(s1.equals(s3)){ //comparing
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equals");
        }
    }
}
