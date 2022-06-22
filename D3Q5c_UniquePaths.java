package akm;

public class D3Q5c_UniquePaths {

//    private int uniquePaths(int m, int n) {
//        double ans=1;
//        int nn=m+n-2;
//        int r=m-1;
//        for (int i = 1; i <=r ; i++) {
//            ans=ans*(nn-r+i)/i;
//        }
////        System.out.println(ans);
//        return (int)Math.round(ans);
//    }

    public static void main(String[] args) {
        D3Q5c_UniquePaths uniquePaths=new D3Q5c_UniquePaths();

//        System.out.println(uniquePaths.uniquePaths(3,7)+"\n");
//        System.out.println(uniquePaths.uniquePaths(53,4)+"\n");
//        System.out.println(uniquePaths.uniquePaths(4,53)+"\n");
//        System.out.println(uniquePaths.uniquePaths(56,5)+"\n");
        System.out.println(uniquePaths.uniquePaths(59,5)+"\n");
    }

///*
 private int uniquePaths(int m, int n) {
        long ans=1;
        int nn=m+n-2;
        int r=m-1;
//        r=Math.min(m,n)-1;
//        for (int i = 1; i <=r ; i++) {
//            System.out.println(ans+" * "+(nn-r+i)+"/"+i+" = "+((nn-r+i)/i));
//            System.out.println((ans*(nn-r+i))+" / "+i);
//            ans=ans*(nn-r+i)/i;
//            System.out.println("ans = "+(ans)+"\n");
//        }

//        for (int i = 1; i <=r ; i++) {
//            ans=ans*(n-1+i)/i;
//        }
        for (int i = 1; i <= r ; i++) {
            System.out.println(ans+" * "+(nn+1-i)+"/"+i+" = "+(((nn+1-i))/i));
            System.out.println(((ans*(nn+1-i)))+" / "+i);
            ans=(ans*(nn+1-i))/i;
            System.out.println("ans = "+(ans)+"\n");
        }

//          for (int i = 1; i <= r ; i++) {
//            System.out.println(ans+" * "+(nn+1-i)+"/"+i+" = "+(((nn+1-i))/i));
//            System.out.println(((ans*(nn+1-i)))+" / "+i);
//            ans=ans*(nn+1-i)/i;
//            System.out.println("ans = "+(ans)+"\n");
//        }

        System.out.println(ans);
        return (int)(ans);
    }
//*/
/*
    private int uniquePaths(int m, int n) {
        long ans=1;
        int nn=m+n-2;
        int r=m-1;

//        this loop is correct
//        for (int i = 1; i <=r ; i++) {
//            ans=ans*(nn-r+i)/i;
//        }

//        this loop is wrong
        for (int i = 1; i <= r ; i++) {
            ans=ans*(nn+1-i)/i;
        }
//        why is it so?? even though both are mathematically correct....
        System.out.println(ans);
          return (int)Math.round(ans);
    }


*/


}


/***
 * 28
 * 26235
 * 455126
 */