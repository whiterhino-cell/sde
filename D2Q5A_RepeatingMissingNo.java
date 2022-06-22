package akm;

import java.util.Arrays;
public class D2Q5A_RepeatingMissingNo {
    public static int[] Sol(int[] arr) {
        int n = arr.length;
        int missing = 0;
        int repeat = 0;
        int[] dummy = new int[n + 1];
        for (int i = 0; i < n; i++) {
            dummy[arr[i]]++;
        }
        System.out.println(Arrays.toString(dummy));
        for (int i = 1; i <=n; i++) {
            if (dummy[i] > 1) {repeat = i; }
            if (dummy[i] == 0) {missing = i; }
        }
        System.out.println(repeat+" "+missing);

        int[] ans= {missing,repeat};

        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 1, 6, 2};
//        int[] arr = {3,4, 7, 5, 7, 6, 2};
//        int[] arr = {3,1,2,5,4,6,7,5};
//        int[] arr = {3,1,2,5,3};
        int[] ans=Sol(arr);
        System.out.println(" The missing element =  " + ans[0]);
        System.out.println(" The repeating  element =  " + ans[1]);
    }
}