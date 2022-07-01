package akm;

public class D11Q4b_SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==target)
                return i;
        }
        return -1;
    }

    public static void main(String args[]) {
        D11Q4b_SearchInRotatedSortedArray array=new D11Q4b_SearchInRotatedSortedArray();
        int arr[] = {4,5,6,7,0,1,2,3};
        int target = 3;
        System.out.println("The index in which the number is present is "+array.search(arr,target));
    }
}
