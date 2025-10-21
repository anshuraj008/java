import java.util.*;

public class ActivitySec {
    public static void main(String[] args) { //0(nlogn)
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        // sorting
        int activities[][] = new int[start.length][3];
        for(int i=0; i<start.length; i++){
            activities[i][0] = i; //activity number
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // lambda function to sort based on end time
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2])); // sort based on end time

        // end time based sorting
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st activity always gets selected
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for(int i=1; i<activities.length; i++){
            if(activities[i][1] >= lastEnd){
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("Maximum number of activities: " + maxAct);
        for(int i=0; i<ans.size(); i++){
            System.out.print("Activity " + ans.get(i) + " ");
        }
        System.out.println();
    }
}
