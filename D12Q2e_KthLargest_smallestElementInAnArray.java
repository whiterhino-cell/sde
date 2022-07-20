package akm;

import java.util.PriorityQueue;

public class D12Q2e_KthLargest_smallestElementInAnArray {
    static int kth_largest_Element(int[] arr, int k) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            priorityQueue.add(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if (priorityQueue.peek()<arr[i]){
                priorityQueue.poll();
                priorityQueue.add(arr[i]);
            }
        }
        return priorityQueue.peek();
    }

    public static void main(String args[]) {

        int arr[]={12,3,5,7,4,19,26};

        int n = arr.length, k = 1;
        System.out.println("Kth largest element is "+ kth_largest_Element(arr, 3));
    }
}
