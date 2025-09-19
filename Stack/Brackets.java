import java.util.*;

public class Brackets {
    public static boolean isValid(String str){
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

        if(s.isEmpty()){
            return true;
        } else {
            return false;
        }
            
    }
        
    public static void main(String[] args) {
        String str = "(({})[]"; //true
        System.out.println(isValid(str));
    }
}
