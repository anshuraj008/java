public class LargestString {
    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"};
        String largest = fruits[0];
        for(int i=1; i<fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){
            largest = fruits[i];
            //o(26)
            //0(n`2)
            }
        }

        System.out.println(largest);
    }
}
