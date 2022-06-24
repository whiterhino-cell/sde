package akm;

public class D7Q5b_RemoveDuplicates_in_placeFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int x=0,i=1;
        for ( i = 1; i < n; i++) {
            if(nums[i]!=nums[x]){
                x++;
                nums[x]=nums[i];
            }
        }
        return x+1;
    }
    public static void main(String[] args) {
        D7Q5b_RemoveDuplicates_in_placeFromSortedArray array=new D7Q5b_RemoveDuplicates_in_placeFromSortedArray();
//        int arr[] = {1,1,2,2,2,3,3};
        int arr[] = {-3,-1,0,0,0,3,3};
//        int arr[] = {1,1,1,2,2,3,3,3,3,4,4};
        int k = array.removeDuplicates(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
