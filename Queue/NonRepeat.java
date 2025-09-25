import java.util.*;

public class NonRepeat {
    public static void findFirstNonRepeating(String str) {
        int freq[] = new int[26]; //'a'-'z'
        Queue<String> q = new LinkedList<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            String chStr = String.valueOf(ch);
            q.add(chStr);
            freq[ch - 'a']++; //increment frequency

            while(!q.isEmpty()) {
                String front = q.peek();
                char frontChar = front.charAt(0);
                if(freq[frontChar - 'a'] > 1) { //remove repeating char
                    q.remove();
                } else {
                    break;
                }
            }

            if(q.isEmpty()) {
                System.out.print(-1+" ");
            } else {
                System.out.print(q.peek()+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String str = "aabccxb"; //expected output: a -1 b b b b x
        System.out.println("Input: " + str);
        System.out.print("Output: ");
        findFirstNonRepeating(str);
        
        // Test with another example
        String str2 = "abccba";
        System.out.println("Input: " + str2);
        System.out.print("Output: ");
        findFirstNonRepeating(str2);
    }
}
