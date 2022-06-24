package akm;

public class D7Q6a_CountMaximumConsecutiveOnesInTheArray {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n= nums.length;
        int count=0,maxi=0;
        for (int i = 0; i < n; i++) {
            if (nums[i]==1)
                for (int j = i; j < n; j++) {
                    if (nums[i]==nums[j]) {
                        count++;
                        maxi=Math.max(count,maxi);

                    }else {
                        count=0;
                        break;
                    }
                }count=0;
        }

        return maxi;
    }

    public static void main(String[] args) {
        D7Q6a_CountMaximumConsecutiveOnesInTheArray array=new D7Q6a_CountMaximumConsecutiveOnesInTheArray();
        System.out.println(array.findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));
        System.out.println(array.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
    }
}
