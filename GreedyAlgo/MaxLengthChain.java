import java.util.*;

public class MaxLengthChain {
    public static void main(String[] args) { //0(nlogn)
        int pairs[][] = {{5, 24}, {15, 25}, {27, 40}, {50, 60}};
        
        // Step 1: Sort pairs based on the second element
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));
        
        // Step 2: Initialize variables to track the count and the end of the last added pair
        int count = 1; // At least one pair can be included
        int lastEnd = pairs[0][1];
        
        // Step 3: Iterate through the pairs to find the maximum length chain
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > lastEnd) {
                count++;
                lastEnd = pairs[i][1];
            }
        }
        
        System.out.println("Maximum Length of Chain: " + count);
    }
}
