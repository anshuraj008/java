public class BinarySearch {
    public static void main(String[] args) {
        int numbers[] = {2,4,5,7,9,15,20,50};
        int key = 15;
        System.out.println("Index of binary key: " + binarySearch(numbers, key));
    }

    public static int binarySearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;
        
        while(start <= end){ //searching mid
            int mid = (start + end) / 2;

            //comparisions
            if(numbers[mid] == key){ //found
                return mid;
            }
            if(numbers[mid] < key){ //right side
                start = mid + 1;
            } else { //left side
                end = mid - 1;
            }
        }
        return -1;
    }
}
