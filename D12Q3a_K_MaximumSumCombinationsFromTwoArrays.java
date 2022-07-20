package akm;

import java.util.Collections;
import java.util.PriorityQueue;

public class D12Q3a_K_MaximumSumCombinationsFromTwoArrays {
    // function to display first C
    // maximum sum combinations
    static int[] KMaxCombinations(int A[], int B[],  int C) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        int n=A.length;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                pq.add(A[i] + B[j]);

        int count = 0;
        int ans[]=new int[C];

        int last=0;
        while (count < C&&count<n*n) {
            last= pq.poll();
            ans[count++]=last;
        }
         while (count < C) {
            ans[count++]=last;
        }
        return ans;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int A[] = { 4, 2, 5, 1 };
        int B[] = { 8, 0, 5, 3 };
        int K = 80;

//        // Function Call
//        int ans[]=KMaxCombinations(A, B, K);
//        for (int x :ans) {
//            System.out.print(x+" ");
//        }

        for (int x :KMaxCombinations(new int[]{3, 2}, new int[]{1,4}, 8)) {
            System.out.print(x+" ");
        }
    }
}
//        A = [1, 4, 2, 3]
//        B = [2, 5, 1, 6]
//        C = 4
//                A = [1, 2, 3, 4]
//                B = [1, 2, 5, 6]
//                C = 4

