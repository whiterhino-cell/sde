package akm;

import java.util.Arrays;

public class D4Q1aTwoSum {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];

        int n= nums.length;
        for (int i = 0; i < n ; i++) {
            for (int j =i+1; j < n; j++) {
                if (nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        D4Q1aTwoSum sum=new D4Q1aTwoSum();
        int[] nums={2,7,11,1};
        int t=9;
        System.out.println(Arrays.toString(sum.twoSum(nums,t)));
        int[] nums2={3,2,4};
        int t2=6;
        System.out.println(Arrays.toString(sum.twoSum(nums2,t2)));
        int[] nums3={3,3};
        int t3=6;
        System.out.println(Arrays.toString(sum.twoSum(nums3,t3)));
    }
}
