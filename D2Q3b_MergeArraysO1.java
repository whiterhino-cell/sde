package akm;

import java.util.Arrays;

public class D2Q3b_MergeArraysO1 {
    public void merge(int[] arr1, int n, int[] arr2, int m) {
        if(m==0||n==0)return;
        if (n!=0) {
            // code here
            int  k;
            for (int i = 0; i < n; i++) {

                if (arr1[i] > arr2[0]) {
                    int temp = arr1[i];
                    arr1[i] = arr2[0];
                    arr2[0] = temp;
                }

                int first = arr2[0];
                // insertion sort is used here
                for ( k = 1; k < m && arr2[k] < first; k++) {
                    arr2[k - 1] = arr2[k];
                }
                arr2[k - 1] = first;
            }
        }

//        insert arr2 in last of arr1
        for(int i=0;i<m;i++){
            arr1[n+i]=arr2[i];
        }
    }
//    [1,2,2,3,5,6]

    public static void main(String[] args) {
        D2Q3b_MergeArraysO1 o1=new D2Q3b_MergeArraysO1();
        int[] a1={1,2,3,0,0,0},a2={2,5,6};
//        int[] a1={0,0,0},a2={2,5,6};
//        int[] a1={1,2,3,0,0,0},a2={};

        o1.merge(a1,3,a2,3);
        System.out.println(Arrays.toString(a1));
    }
}
