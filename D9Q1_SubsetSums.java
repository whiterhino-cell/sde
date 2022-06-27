package akm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class D9Q1_SubsetSums {
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> sumSubset = new ArrayList<>();
        func(0, 0, arr, N, sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
    }
    void func(int ind, int sum, ArrayList<Integer> arr, int N, ArrayList<Integer> sumSubset) {
        if(ind == N) {
            sumSubset.add(sum);
            return;
        }
        // pick the element
        func(ind + 1, sum + arr.get(ind), arr, N, sumSubset);

        // Do-not pick the element
        func(ind + 1, sum, arr, N, sumSubset);
    }

    public static void main(String[] args) {
        D9Q1_SubsetSums subsetSums=new D9Q1_SubsetSums();
        int n = 3;
        ArrayList<Integer> arrayList=new ArrayList<>(Arrays.asList(5, 2, 1));
        ArrayList<Integer> ansAL=subsetSums.subsetSums(arrayList,n);
        System.out.println(ansAL);
    }
}
