public class min_max_avg {
    public static void main(String[] args) {
        int[] numbers = {5,10,15,20,25};
        int min = numbers[0];
        int max = numbers[0];
        int avg = 0;

        for(int i = 0; i < numbers.length; i++){
            if(min < numbers[i]) {
                min = numbers[i];
            }

            if(max > numbers[i]){
                max = numbers[i];
            }

            avg = avg + numbers[i];
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(avg/5);
    }
    
}
