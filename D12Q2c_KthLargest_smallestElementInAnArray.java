package akm;

import java.util.PriorityQueue;

public class D12Q2c_KthLargest_smallestElementInAnArray {
    static int partition(int[] arr, int left, int right) {
        int pivot = arr[left] ;
        int l = left + 1 ;
        int r = right;
        while (l <= r) {
            if (arr[l] < pivot && arr[r] > pivot) {
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++ ;
                r-- ;
            }
            if (arr[l] >= pivot) {
                l++;
            }
            if (arr[r] <= pivot) {
                r--;
            }
//            for (int x :arr) {
//                System.out.print(x+" ");
//            }
//            System.out.println();
        }
        int temp2=arr[left];
        arr[left]=arr[r];
        arr[r]=temp2;
//        for (int x :arr) {
//            System.out.print(x+" ");
//        }
//        System.out.println();
        return r;
    }

    static int kth_Largest_Element(int[] arr, int k) {

        int left = 0, right = arr.length - 1, kth;
        while (true) {
//            for (int x :arr) {
//                System.out.print(x+" ");
//            }
//            System.out.println();
            int idx = partition(arr, left, right);
//            System.out.println("\n"+left+" : "+right+" :: "+idx+"\n\n");
            if (idx == k - 1) {
                kth = arr[idx];
                break;
            }
            if (idx < k - 1) {
                left = idx + 1;
            } else {
                right = idx - 1;
            }
        }
        return kth;
    }

    public static void main(String args[]) {

        int arr[]={12,3,5,7,4,19,26};

        int k = 4;  //7
//        k=arr.length-k+1;
//        System.out.println(k);
        System.out.println(k+"th Largest element is "+kth_Largest_Element(arr, k));

        k=1;    //3
        k=arr.length-k+1;
//        System.out.println(k);
        System.out.println((arr.length-k+1)+"th Smallest element is "+kth_Largest_Element(arr, k));

    }
}
// 6 5 4 3 2 1
//k=n-k+1