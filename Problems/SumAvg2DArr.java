public class SumAvg2DArr {

    public static void main(String[] args) {
        System.out.println("Welcome to Sum and Average of 2D array program");
        int[][] numArr = ArrayUtility.input2DArray();
        long sum = sum(numArr);
        double avg = average(numArr);
        System.out.println("Sum of all elements in 2D array is " + sum);
        System.out.println("Average of all elements in 2D array is " + avg);
    }

        public static double average(int[][] numArr) {
            if(numArr.length == 0) {
                return 0;
            }
            int rows = numArr.length;
            int columns = numArr[0].length;
            double avg = 0;
            avg = (double) sum(numArr) / (rows * columns);
        return avg; 
    }

    public static long sum(int[][] numArr) {
        long sum = 0;
        int i = 0;
        int j = 0;
        while (i < numArr.length) {
            while (j < numArr[i].length) {
                sum += numArr[i][j];
                j++;
            }
            i++;
            j = 0;
        }
        return sum; 
    }
}
