/*** Lets not make it complicated */

package akm;

import java.util.*;

public class D4Q2c_FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> quad=new ArrayList<>();
        Arrays.sort(nums);
        int n= nums.length;
        for (int i = 0; i < n ; i++) {
            for (int j = i+1; j < n; j++) {

//                twoSum()

                while (j+1<n&&nums[j+1]==nums[j])j++;//skip j
            }while (i+1<n&&nums[i+1]==nums[i])i++;    //skip i
        }
        return quad;
    }
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
        D4Q2c_FourSum sum=new D4Q2c_FourSum();
        int[] num={4 ,3 ,3 ,4 ,4 ,2 ,1 ,2 ,1, 1};
        int target=7;
        System.out.println(sum.fourSum(num,target));

    }
}
