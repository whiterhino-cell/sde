package akm;

public class D3Q3c_Majority_ElementN2 {
    public int majorityElement(int[] nums) {
        int me=nums[0];
        int c=1;
        for (int i = 1; i < nums.length; i++) {
            if (c==0){
                me=nums[i];
                c=1;
            }else if(nums[i]==me){
                c++;
            }else {
                c--;
            }
//            7,7,5,7,5,5,7,5,5,7,7,5,5,5,5
        }
        return me;
    }

    public static void main(String[] args) {
        D3Q3c_Majority_ElementN2 elementN2=new D3Q3c_Majority_ElementN2();
//        int[]  nums = {2,2,1,1,1,2,2};
        int[]  nums = {7,7,5,7,5,5,7,5,5,7,7,5,5,5,5};
        System.out.println(elementN2.majorityElement(nums));
    }
}
// {1,1,1,2,2,2,2}

// {1,1,4,5,6,6,6,9}