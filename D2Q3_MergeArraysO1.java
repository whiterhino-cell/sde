package akm;

import java.util.Arrays;

public class D2Q3_MergeArraysO1 {
    public void merge(int[] arr1, int n, int[] arr2, int m) {

        for(int i=0;i<m;i++){
            arr1[n+i]=arr2[i];
        }
        Arrays.sort(arr1);
    }

}
