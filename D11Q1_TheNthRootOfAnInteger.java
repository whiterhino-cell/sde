package akm;

public class D11Q1_TheNthRootOfAnInteger {
    public static double findNthRootOfM(int n, long m) {
        double low = 1;
        double high = m;
        double eps = 1e-6;

        while((high - low) > eps) {
//            double mid = low+((high-low) / 2.0);
            double mid = ((high+low) / 2.0);
            if(multiply(mid, n) < m) low = mid;
            else high = mid;
        }
        System.out.println();
//        System.out.println(Math.pow(m,(double)(1.0/(double)n))+"........");
        int places=6;
        int factor = (int) Math.pow(10, (places+1));
        System.out.println(factor);
        low = low * (double) factor;
        System.out.println(low);
        long tmp = Math.round(low);
        System.out.println("temp :"+tmp+"...."+((double) tmp / (double)factor));
        low= (double) tmp / (double)factor;
        return (low);
    }
    private static double multiply(double mid, int n) {
        double ans = 1.0;
        for(int i = 1;i<=n;i++) {
            ans = ans * mid;
        }
        return ans;
    }
    public static void main (String[] args) {
        System.out.println(findNthRootOfM(3, 27));//3.000000
        System.out.println(findNthRootOfM(4, 69));//2.882121
        System.out.println(findNthRootOfM(2, 3));//1.732051
        System.out.println(findNthRootOfM(2, 4));//2.000000
        System.out.println(findNthRootOfM(3, 7));//1.912931
        System.out.println(findNthRootOfM(3, 8));//2.000000
        System.out.println(findNthRootOfM(2, 9));//3.000000
        System.out.println(findNthRootOfM(1, 1));//1.000000
        System.out.println(findNthRootOfM(2, 5));//2.236068
        System.out.println(findNthRootOfM(3, 10));//2.154435
    }
}
