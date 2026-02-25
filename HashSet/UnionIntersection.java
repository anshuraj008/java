import java.util.*;

public class UnionIntersection {
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        HashSet<Integer> set1 = new HashSet<>();

        //union
        for(int i=0; i<arr1.length; i++){
            set1.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++){
            set1.add(arr2[i]);
        }
        System.out.println("Union: "+set1.size());
        System.out.println("Union elements: "+set1);

        //intersection
        set1.clear();
        for(int i=0; i<arr1.length; i++){
            set1.add(arr1[i]);
        }

        HashSet<Integer> set2 = new HashSet<>();
        int count=0;
        for(int i=0; i<arr2.length; i++){
            if(set1.contains(arr2[i])){
                count++;
                set2.add(arr2[i]);
                set1.remove(arr2[i]); 
            }
        }
        System.out.println("Intersection: "+count);
        System.out.println("Intersection elements: "+ set2);
    }
}
