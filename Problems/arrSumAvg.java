
public class arrSumAvg {
    public static void main(String[] args) {
        System.out.println("Welcome to the Array Sum and Average Calculator!");
        
        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        int avg = average(numArray);
        System.out.println("The sum of the array is: " + sum);
        System.out.println("The average of the array is: " + avg);
        
    }

    public static long sum(int[] numArray) {
        long sum = 0; 
        int i = 0;
        while(i < numArray.length){
        sum += numArray[i];
        i++;
        }
        return sum;
    }

    public static int average(int[] numArray) {
        long sum = sum(numArray);
        return (int) (sum / numArray.length);
    }
}
