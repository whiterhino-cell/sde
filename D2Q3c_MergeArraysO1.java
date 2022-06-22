package akm;

import java.util.Arrays;

public class D2Q3c_MergeArraysO1 {
   void swap(int []arr1,int i,int arr2[],int j) {
        int temp=arr1[i];
        arr1[i]=arr2[j];
        arr2[j]=temp;
    }
    public void merge(int[] arr1, int n, int[] arr2, int m) {
        int gap =(int) Math.ceil((double)(n + m) / 2.0);
        while (gap > 0) {
            int i = 0;
            int j = gap;
            while (j < (n + m)) {
                if (j < n && (arr1[i] > arr1[j])) {
                    swap(arr1,i,arr1,j);
                } else if (j >= n && i < n && (arr1[i] > arr2[j - n])) {
                    swap(arr1,i, arr2,j - n);
                } else if (j >= n && i >= n &&( arr2[i - n] > arr2[j - n])) {
                    swap(arr2,i - n, arr2,j - n);
                }
                j++;
                i++;
            }
            if (gap == 1) {
                gap = 0;
            } else {
                gap =(int) Math.ceil((double) gap / 2.0);
            }
        }
        for(int i=0;i<m;i++){
            arr1[n+i]=arr2[i];
        }
    }
    public static void main(String[] args) {
        D2Q3c_MergeArraysO1 o1=new D2Q3c_MergeArraysO1();
        int[] a1={1,2,3,0,0,0},a2={2,5,6};
//        int[] a1={0,0,0},a2={2,5,6};
//        int[] a1={1,2,3,0,0,0},a2={};

        o1.merge(a1,3,a2,3);
        System.out.println(Arrays.toString(a1));
    }

}
//O(nlogn+n)