package akm;

public class D3Q2b_Pow_x_n {
    public double myPow(double x, int n) {
        double ans=1;
        long m=n;
        if (n<0)m=-n;
        while(m>0){
            if(m%2==0){
                x*=x;
                m/=2;
            }else {
                ans*=x;
                m--;
            }
        }
        if (n<0) return 1/ans;
        return ans;
    }

    public static void main(String[] args) {

        D3Q2b_Pow_x_n pow_x_n=new D3Q2b_Pow_x_n();

        double x=2.0;
        int n=10;

        System.out.println(pow_x_n.myPow(x,n));
    }
}
