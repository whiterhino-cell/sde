package akm;

import java.util.Arrays;

public class D8Q3_JobSequencingProblem {
    int[] JobScheduling(Job arr[], int n){
        Arrays.sort(arr, (a, b) -> (b.profit - a.profit));

        int maxi = 0;
        for(int i = 0;i<n;i++) {
            if(arr[i].deadline > maxi) {
                maxi = arr[i].deadline;
            }
        }

        int result[] = new int[maxi + 1];

        for(int i = 1;i<=maxi;i++) {
            result[i] = -1;
        }

        int countJobs = 0, jobProfit = 0;

        for (int i = 0; i < n; i++) {
            for (int j = arr[i].deadline; j > 0; j--) {
                // Free slot found
                if (result[j] == -1) {
                    result[j] = i;
                    countJobs++;
                    jobProfit += arr[i].profit;
                    break;
                }
            }
        }

        int ans[] = new int[2];
        ans[0] = countJobs;
        ans[1] = jobProfit;
        return ans;

    }

    public static void main(String[] args) {
        int N = 5 ;
        Job job[]=new Job[5];
        job[0]=new Job(1,2,100);;
        job[1]=new Job(2,1,19);
        job[2]=new Job(3,2,27);
        job[3]=new Job(4,1,25);
        job[4]=new Job(5,1,15);
        D8Q3_JobSequencingProblem problem=new D8Q3_JobSequencingProblem();
        int ans[]=problem.JobScheduling(job,N);
        System.out.println("Job    :"+ans[0]);
        System.out.println("Profit :"+ans[1]);
    }

    static class Job {
        int id, profit, deadline;
        Job(){}

        public Job(int id, int profit, int deadline) {
            this.id = id;
            this.profit = profit;
            this.deadline = deadline;
        }
    }
}
