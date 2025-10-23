import java.util.*;

public class MinSumAbs {
    public static void main(String[] args) { //0(nlogn)
        int A[] = {1, 8, 1};
        int B[] = {2, 5, 3};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;
        for(int i=0; i<A.length; i++){
            minDiff += Math.abs(A[i] - B[i]);
        }

        System.out.println("Minimum Sum of Absolute Differences: " + minDiff);
    }
}
