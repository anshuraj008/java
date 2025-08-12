public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,1,2};
        selectionSortIncre(arr);
        selectionSortDecre(arr);
        printArr(arr);
    }

    //Incresing Order
    public static void selectionSortIncre(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){ //searching elements
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

    }

    //Decresing order
    public static void selectionSortDecre(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){ //searching elements
                if(arr[minPos] < arr[j]){
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

    }

    //print array
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
