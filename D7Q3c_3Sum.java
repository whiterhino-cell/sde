package akm;

import java.util.*;

public class D7Q3c_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List < List < Integer >> res = new ArrayList < > ();
        int len=nums.length;

        for (int i = 0; i < len - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int lo = i + 1, hi = len - 1, sum = 0 - nums[i];

                while (lo < hi) {
                    if (nums[lo] + nums[hi] == sum) {
                        ArrayList < Integer > temp = new ArrayList <> ();
                        temp.add(nums[i]);
                        temp.add(nums[lo]);
                        temp.add(nums[hi]);
                        res.add(temp);

                        while (lo < hi && nums[lo] == nums[lo + 1]) lo++;
                        while (lo < hi && nums[hi] == nums[hi - 1]) hi--;

                        lo++;
                        hi--;
                    } else if (nums[lo] + nums[hi] < sum) lo++;

                    else hi--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        D7Q3c_3Sum sum=new D7Q3c_3Sum();

        System.out.println(sum.threeSum(new int[]{-1,0,1,2,-1,-4}));
//        System.out.println(sum.threeSum(new int[]{0}));
//        System.out.println(sum.threeSum(new int[]{}));
    }
}
