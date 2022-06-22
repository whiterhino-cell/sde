package akm;

public class D3Q2a_Pow_x_n {
    public double myPow(double x, int n) {
        double ans=1;
        long nn=n;
        if (n<0) nn=-n;
        for (int i = 0; i < nn; i++) {
            ans*=x;
        }
        if (n<0) return 1.0/ans;
        return ans;
//       return Math.pow(x,n);
    }

    public static void main(String[] args) {
        D3Q2a_Pow_x_n pow_x_n=new D3Q2a_Pow_x_n();

        double x=2.0;
        int n=10;

        System.out.println(pow_x_n.myPow(x,n));
    }
}
