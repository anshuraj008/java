import java.util.*;

public class JobSequence {
    static class Job {
        int id; //0(A), 1(B), 2(C)
        int deadline;
        int profit;

        public Job(int i, int d, int p) {
            this.id = i;
            this.deadline = d;
            this.profit = p;
        }
    }
    public static void main(String[] args) {
        int jobInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobInfo.length; i++) {
            jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1])); // id, deadline, profit
        }

        //Lamda function
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit); // Sort in descending order of profit

        ArrayList<Integer> seq = new ArrayList<>();

        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            Job currJob = jobs.get(i);
            if (time < currJob.deadline) {
                seq.add(currJob.id);
                time++;
            }
        }

        System.out.println("The job sequence is: " + seq.size());
        for (int i = 0; i < seq.size(); i++) {
            System.out.print((char)('A' + seq.get(i)) + " ");
        }
        System.out.println();
    }
}
