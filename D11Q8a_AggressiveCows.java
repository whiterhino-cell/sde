package akm;

import java.util.Arrays;

public class D11Q8a_AggressiveCows {
    static boolean isCompatible(int inp[], int dist, int cows) {
        int n = inp.length;
        int k = inp[0];
        cows--;
        for (int i = 1; i < n; i++) {
            if (inp[i] - k >= dist) {
                cows--;
                if (cows == 0) {
                    return true;
                }
                k = inp[i];
            }
        }
        return false;
    }
    public int cowDistance(int n, int[] arr, int cow){
        Arrays.sort(arr);
        int maxD = arr[n - 1] - arr[0];
        int ans = Integer.MIN_VALUE;
        for (int diff = 1; diff <= maxD; diff++) {
            if (isCompatible(arr, diff, cow)) {
                ans = Math.max(ans, diff);
            }else {
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        D11Q8a_AggressiveCows cows=new D11Q8a_AggressiveCows();
        int n = 5, m = 3;
        int inp[] = {1,2,8,4,9};
        int ans=cows.cowDistance(n,inp,m);
        System.out.println(ans);
    }
}
