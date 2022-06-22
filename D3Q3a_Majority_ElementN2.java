package akm;

public class D3Q3a_Majority_ElementN2 {
    public int majorityElement(int[] nums) {
        int c=0;
        for (int i = 0; i < nums.length; i++) {

            for (int j = i; j < nums.length; j++) {
                if (nums[i]==nums[j])c++;
            }
            if (c> nums.length/2)return nums[i];
            c=0;
        }
        return 0;
    }

    public static void main(String[] args) {
        D3Q3a_Majority_ElementN2 elementN2=new D3Q3a_Majority_ElementN2();
        int[]  nums = {2,2,1,1,1,2,2};
        System.out.println(elementN2.majorityElement(nums));
    }
}
// {1,1,1,2,2,2,2}

// {1,1,4,5,6,6,6,9}