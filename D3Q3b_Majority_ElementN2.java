package akm;

import java.util.HashMap;

public class D3Q3b_Majority_ElementN2 {
    public int majorityElement(int[] nums) {
    int n=nums.length;

    HashMap<Integer,Integer> bumHM=new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        if (bumHM.get(nums[i])==null){
            bumHM.put(nums[i],1 );
        }else {
            int c=bumHM.get(nums[i])+1;
            bumHM.put(nums[i], c);
            if (c>n/2)
                return nums[i];
        }
    }
    return 0;
}

    public static void main(String[] args) {
        D3Q3b_Majority_ElementN2 elementN2=new D3Q3b_Majority_ElementN2();
        int[]  nums = {2,2,1,1,1,2,2};
        System.out.println(elementN2.majorityElement(nums));

        int[]  nums1 = {0};
        System.out.println(elementN2.majorityElement(nums1));
        int[]  nums2 = {7,7,5,7,5,5,7,5,5,7,7,5,5,5,5};
        System.out.println(elementN2.majorityElement(nums2));
    }
}