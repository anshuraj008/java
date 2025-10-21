import java.util.*;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int values[] = {60, 100, 120};
        int weights[] = {10, 20, 30};
        int capacity = 50;

        double ratio[][] = new double[values.length][2]; 
        //0th col => index, 1st col => value/weight ratio

        for(int i=0; i<values.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = values[i] / (double)weights[i];
        }

        // sorting based on value/weight ratio in descending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int remainingCapacity = capacity;
        int totalValue = 0;

        for(int i=ratio.length-1; i>=0; i--){
            int idx = (int)ratio[i][0];
            if(weights[idx] <= remainingCapacity){
                totalValue += values[idx];
                remainingCapacity -= weights[idx];
            } else {
                // take fractional part
                totalValue += values[idx] * ((double)remainingCapacity / (double)weights[idx]);
                remainingCapacity = 0;
                break;
            }
        }

        System.out.println("Maximum profit: " + totalValue);
    }
}
