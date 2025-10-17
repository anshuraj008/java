public class findPermutations {
    public static void FindPermutations(String str, String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        //recursion 0(n*n!)
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            FindPermutations(newStr, ans + curr);
        }
}    
    public static void main(String[] args) {
        String str = "abc";
        FindPermutations(str, "");
    }
}
