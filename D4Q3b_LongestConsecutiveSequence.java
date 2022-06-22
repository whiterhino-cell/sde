package akm;

import java.util.Arrays;
import java.util.HashMap;

public class D4Q3b_LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int count=1,maxcount=0,n=nums.length;
        if (nums.length<=1) return nums.length;
        HashMap<Integer,Integer> ds=new HashMap<>();

        for (int i = 0; i < n; i++) {
            ds.put(nums[i],nums[i] );
        }
        for (int num:nums) {
            count=1;
            if (ds.get(num-1)==null){
                int temp=num;
                while (ds.get(temp+1)!=null){
                    count++;
                    temp++;
                }
                maxcount=Math.max(count,maxcount);
            }
        }
        return maxcount;
    }
    public static void main(String[] args) {

        D4Q3b_LongestConsecutiveSequence sequence=new D4Q3b_LongestConsecutiveSequence();
//        int nums[]={100,4,200,1,3,2};
//        int nums[]={0,3,7,2,5,8,4,6,0,1};
//        int nums[]={};
        int nums[]={1,3,1,2,0,7,9};
        int ans=sequence.longestConsecutive(nums);
        System.out.println(ans);
    }
}

