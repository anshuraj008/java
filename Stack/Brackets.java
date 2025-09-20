import java.util.*;

public class Brackets {
    public static boolean isValid(String str){//O(n)
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            //opening
            if(curr == '(' || curr == '{' || curr == '['){
                s.push(curr);
            } else { //closing
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek() == '(' && curr == ')') || //()
                   (s.peek() == '{' && curr == '}') || //{}
                   (s.peek() == '[' && curr == ']')){ //[]
                    s.pop();
                } else {
                    return false;
                }
            }
        }

        return s.isEmpty();
    }


    public static  boolean isDuplicate(String str2){//O(n)
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str2.length(); i++){
            char curr = str2.charAt(i);
            if(curr == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){ //duplicate found
                    return true;
                } else {
                    s.pop(); //pop opening bracket
                }
            } else {
                s.push(curr);
            }
        }
        return false;
    }
        
    public static void main(String[] args) {
        String str = "(({})[]"; //false - missing closing parenthesis
        System.out.println(isValid(str)); // Output: false
        
        // Test with a valid balanced string
        String validStr = "(({})[])" ; // true - properly balanced
        System.out.println(isValid(validStr)); // Output: true

        String str2 = "((a+b))"; //true - Noduplicate ( )
        System.out.println(isDuplicate(str2)); // Output: false

        String str3 = "(a-b)"; //false - duplicate
        System.out.println(isDuplicate(str3)); // Output: true
    }
}