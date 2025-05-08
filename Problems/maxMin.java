public class maxMin {
    public static void main(String[] args) {
        System.out.println("Welcome to max and min\n");
        int[] numArr = ArrayUtility.inputArray();
        int max = max(numArr);
        int min = min(numArr);
        System.out.println("Max: = " + max);
        System.out.println("Min: = " + min);
    }

    public static int min(int[] numArr) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < numArr.length){
            if (numArr[i] < min){
                min = numArr[i];
            }
            i++;
        }
        return min;
    }

    public static int max(int[] numArr) {
        if (numArr.length == 0){
            return Integer.MIN_VALUE;
        }
        int max = numArr[0];
        int i = 1;
        while (i < numArr.length){
            if (numArr[i] > max){
                max = numArr[i];
            }
            i++;
        }
        return max;
    }
}
