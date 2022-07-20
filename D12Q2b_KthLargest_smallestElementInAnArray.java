package akm;

import java.util.Arrays;
import java.util.PriorityQueue;

public class D12Q2b_KthLargest_smallestElementInAnArray {
    static void kth_Largest_MaxHeap(int[] arr, int k) {

        PriorityQueue<Integer> pq= new PriorityQueue<>((a, b)->b-a);

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i])  ;
        }
//        System.out.print(pq+" ");
        int f = k - 1 ;
        while (f > 0) {
            pq.remove();
            f-- ;
        }

        System.out.println(k+"th Largest element "+pq.peek());
    }

    static void kth_Smallest_MinHeap(int[] arr, int k) {
        PriorityQueue<Integer>pq= new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i])  ;
        }

        int f = k - 1 ;
        while (f > 0) {
            pq.remove()  ;
            f-- ;
        }

        System.out.println(k+"th Smallest element "+pq.peek())  ;
    }

    public static void main(String args[]) {

        int arr[] = {1, 2, 6, 4, 5, 3}  ;

        kth_Largest_MaxHeap(arr, 3)  ;
        kth_Smallest_MinHeap(arr, 3)  ;
    }
}
