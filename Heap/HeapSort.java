import java.util.*;

public class HeapSort {
    private static void heapify(int arr[], int i, int size){
        int left = 2*i + 1;
        int right = 2*i + 2;
        int maxIdx = i;

            if(left < size && arr[maxIdx] < arr[left]){
                maxIdx = left;
            }

        if(right < size && arr[maxIdx] < arr[right]){
            maxIdx = right;
        }

        if(maxIdx != i){
            // swap
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr, maxIdx, size);
        }
    }

    public static void heapSort(int arr[]){ // O(nlogn)
       // step 1: build max heap
       int n = arr.length;
       for(int i=n/2; i>=0; i--){
        heapify(arr, i, n);
       }

         // step 2: remove elements one by one from heap
            for(int i=n-1; i>0; i--){
                // swap first and last
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
    
                // heapify root element
                heapify(arr, 0, i);
            }
    }

    public static void main(String[] args) {
        int arr[] = {5,3,8,4,1,2};
        heapSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
