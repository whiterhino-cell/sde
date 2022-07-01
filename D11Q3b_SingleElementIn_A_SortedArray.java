package akm;

public class D11Q3b_SingleElementIn_A_SortedArray {

    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 2;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid % 2 == 0) {
                // Checking whether we are in left half
                if (nums[mid] != nums[mid + 1])

                    //Shrinking the right half
                    high = mid - 1;
                else
                    // Shrinking the left half
                    low = mid + 1;
            } else {
                // Checking whether we are in right half
                if (nums[mid] == nums[mid + 1])
                    //Shrinking the right half
                    high = mid - 1;
                else
                    // Shrinking the left half
                    low = mid + 1;
            }
        }
        return nums[low];
    }
    public static void main(String args[]) {
        D11Q3b_SingleElementIn_A_SortedArray element =new D11Q3b_SingleElementIn_A_SortedArray();
        int arr1[] = {1,1,2,3,3,4,4,8,8};//2
        System.out.println(element.singleNonDuplicate(arr1));
        int arr2[] = {11,22,22,34,34,57,57}  ;//11
        System.out.println(element.singleNonDuplicate(arr2));
        int arr3[] = {3,3,7,7,10,11,11};//10
        System.out.println(element.singleNonDuplicate(arr3));
//        int arr4[] = {1,1,2,3,3,4,4,8,8};
//        System.out.println(element.singleNonDuplicate(arr4));
//        int arr5[] = {1,1,2,3,3,4,4,8,8};
//        System.out.println(element.singleNonDuplicate(arr5));

    }
}