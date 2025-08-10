public class Linear {
    public static void main(String[] args) {
        int numbers[] = {2,4,5,7,9,10,20};
        // String menu[] = {"pizza, dosa, eggroll, fryrice"};
        int key = 10;

        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.println("Not Found");
        } else {
             System.out.println("key is at index : " + index);
        }
    }

    public static int linearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }    
        }
        return -1;
    }
}
