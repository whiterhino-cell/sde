package akm;

public class D11Q1a_NthRootOf_A_NumberUsingBinarySearch {
    private static double multiply(double number, int n) {
        double ans = 1.0;
        for(int i = 1;i<=n;i++) {
            ans = ans * number;
        }
        return ans;
    }
    public static double getNthRoot(int n, long m) {
        double low = 1;
        double high = m;
        double eps = 1e-6;

        while((high - low) > eps) {
            double mid = (low + high) / 2.0;
            if(multiply(mid, n) < m) {
                low = mid;
            }
            else {
                high = mid;
            }
        }
//        System.out.println(n+"th root of "+m+" is "+low);
        return low;
    }
    public static void main (String[] args) {
        int n = 3, m = 27;
        System.out.println(getNthRoot(n, m));
    }
}
