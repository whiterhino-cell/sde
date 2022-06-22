package akm;

import java.util.Arrays;

public class D4Q3a_LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int count=1,maxcount=0,n=nums.length;
        Arrays.sort(nums);
        if (nums.length<=1) return nums.length;

        for (int i = 1; i < n; i++) {
           if (nums[i-1]+1==nums[i]){
               count++;
           }else if(nums[i-1]==nums[i]){
                //to skip
           } else {
               count=1;
           }
            maxcount=Math.max(count,maxcount);
        }
        return maxcount;
    }
    public static void main(String[] args) {

        D4Q3a_LongestConsecutiveSequence sequence=new D4Q3a_LongestConsecutiveSequence();
//        int nums[]={100,4,200,1,3,2};
//        int nums[]={0,3,7,2,5,8,4,6,0,1};
//        int nums[]={};
        int nums[]={1,3,1,2,0,7,9};
        int ans=sequence.longestConsecutive(nums);
        System.out.println(ans);
    }
}
