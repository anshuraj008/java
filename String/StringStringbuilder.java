public class StringStringbuilder {
    public static void main(String[] args) {
        //String Immutable 0(n^2)
        String str = "";
        for (char ch = 'a'; ch <= 'z'; ch++) {
            str = str + ch;  // creates a new String every time
        }
        System.out.println("Using String: " + str);


        //StringBuilder mutable 0(n) 
        StringBuilder sb = new StringBuilder();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);  // modifies existing object
        }

        System.out.println("Using StringBuilder: " + sb.toString());
    }
}
