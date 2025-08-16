public class SubString {
    public static void main(String[] args) {
      //substring
        String str = "Hello world";
        System.out.println(substring(str, 0,5));
    }

    public static String substring(String str, int si, int ei){
        String substr = "";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
}
