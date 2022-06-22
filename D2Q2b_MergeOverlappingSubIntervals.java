package akm;

import java.util.*;

// brute force jaqbarjasti lag raha hai

public class D2Q2b_MergeOverlappingSubIntervals {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> ans =new ArrayList<>();
        if (intervals.length==0||intervals==null)
            return intervals;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int f=intervals[0][0],s=intervals[0][1];
        for (int[] a :intervals) {
            if (s>=a[0]){
                s=Math.max(s,a[1]);
            }else {
                int []flag={f,s};
                ans.add(flag);
                f=a[0];
                s=a[1];
            }
        }
        int []flag={f,s};
        ans.add(flag);
        return ans.toArray(new int[0][]);
    }
}
