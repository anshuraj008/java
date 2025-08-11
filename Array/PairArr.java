public class PairArr {
    public static void main(String[] args) {
        int numbers[] = {2,3,5,7,9,19};
        printPairs(numbers);
    }

    public static void printPairs(int numbers[]){
        int tp = 0;

        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i]; //2,3,5,7,9,19
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("("+ curr +"," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs = " + tp);
    }
}
