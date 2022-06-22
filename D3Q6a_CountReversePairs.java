package akm;

public class D3Q6a_CountReversePairs {
    public int reversePairs(int[] nums) {
        int count=0;

        int n= nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                long a=nums[i],b=nums[j];
                if (a>2*b){
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        D3Q6a_CountReversePairs pairs=new D3Q6a_CountReversePairs();
//        int[] nums={1,3,2,3,1};
//        int[] nums={2,4,3,5,1};
        int[] nums={2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        System.out.println(pairs.reversePairs(nums));
    }
}
