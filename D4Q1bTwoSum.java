package akm;

import java.util.Arrays;
import java.util.HashMap;

public class D4Q1bTwoSum {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        HashMap<Integer,Integer> hm=new HashMap<>();

        int n= nums.length,res=0;
        for (int i = 0; i < n ; i++) {
          res=target-nums[i];
          if (!hm.containsKey(res)){
              hm.put(nums[i],i);
          }else {
              ans[0]=i;
              ans[1]=hm.get(res);
          }
        }
        return ans;
    }
    public static void main(String[] args) {
        D4Q1bTwoSum sum=new D4Q1bTwoSum();
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
