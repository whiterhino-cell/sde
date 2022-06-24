package akm;

public class D7Q6b_CountMaximumConsecutiveOnesInTheArray {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        int maxi = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cnt++;
            } else {
                cnt = 0;
            }
            maxi = Math.max(maxi, cnt);
        }
        return maxi;
    }

    public static void main(String[] args) {
        D7Q6b_CountMaximumConsecutiveOnesInTheArray array=new D7Q6b_CountMaximumConsecutiveOnesInTheArray();
        System.out.println(array.findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));
        System.out.println(array.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
    }
}
