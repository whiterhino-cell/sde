package akm;

import java.util.Arrays;

public class D3Q3A_MajorityElement2 {
    public int majorityElement(int[] nums) {
        int n= nums.length;
        int count=1;
        Arrays.sort(nums);
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) count++;
            else count=1;

            if (count>n/2) return nums[i];

        }
        return 0;
    }
    public static void main(String[] args) {
        D3Q3A_MajorityElement2 elementN2=new D3Q3A_MajorityElement2();
        int[]  nums = {2,2,2,1,1,1,2,2};
        System.out.println(elementN2.majorityElement(nums));

    }
}
// {1,1,1,2,2,2,2}

  //{1,1,4,5,6,6,6,9}




