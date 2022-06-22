package akm;

import java.util.*;

public  class D1Q5A_SortColors {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static int[] sortColors(int[] nums) {
        int low =0;
        int mid = 0;
        int high = (nums.length) - 1;
        while (mid <= high) {
            switch (nums[mid]) {
                case 0: {
                    swap(nums, low, mid);
                    low++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    swap(nums, high , mid);
                    high--;
                    break;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2, 0, 1, 2, 2, 1, 0};
        int[] nums2 = {0};
        int[] nums3 = {2,0,1};
        int[] nums4 = {2,0,2,1,1,0};

        System.out.println("res : " + Arrays.toString(sortColors(nums1)));
        System.out.println("res : " + Arrays.toString(sortColors(nums2)));
        System.out.println("res : " + Arrays.toString(sortColors(nums3)));
        System.out.println("res : " +Arrays.toString(sortColors(nums4)));
    }
}

