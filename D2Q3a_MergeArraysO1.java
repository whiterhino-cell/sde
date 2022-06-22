package akm;

import java.util.Arrays;

public class D2Q3a_MergeArraysO1 {
    public void merge(int[] arr1, int n, int[] arr2, int m){
        int rista[]=new int[n+m];
        int i=0,j=0,x=0;
        while(i<n&&j<m){
            if (arr1[i]<arr2[j]) {
                rista[x++] = arr1[i++];
            }else {
                rista[x++] = arr2[j++];
            }
        }

        while (i<n){
            rista[x++] = arr1[i++];
        }

        while (j<m){
            rista[x++] = arr2[j++];
        }

        for (int k = 0; k < n + m; k++) {
            arr1[k]=rista[k];
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
