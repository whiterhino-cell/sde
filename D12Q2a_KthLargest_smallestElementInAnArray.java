package akm;

import java.util.Arrays;

public class D12Q2a_KthLargest_smallestElementInAnArray {
    static void kth_Largest_And_Smallest_By_AscendingOrder(int[] arr, int k) {

        Arrays.sort(arr);
        int n = arr.length;

        System.out.println("kth Largest element "+arr[n - k]+", "+
                "kth Smallest element "+arr[k - 1]);
    }

    public static void main(String args[]) {

        int arr[] = {1, 2, 6, 4, 5, 3};

        kth_Largest_And_Smallest_By_AscendingOrder(arr, 3) ;

    }
}

//123456
