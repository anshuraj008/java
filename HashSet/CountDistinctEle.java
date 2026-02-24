import java.util.*;

public class CountDistinctEle {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3};
        HashSet<Integer> distinctElements = new HashSet<>();

        // for(int i=0; i<arr.length; i++){
        //     distinctElements.add(arr[i]);
        // }

        // Advanced for loop (for-each loop)
        for (int num : arr) { //0(n)
            distinctElements.add(num);
        }
        System.out.println("Number of distinct elements: " + distinctElements.size());
    }
}