package akm;

public class D3Q5a_UniquePaths {

    private int uniquePaths(int m, int n) {
        return countPaths(0,0,m,n);
    }

    private int countPaths(int i, int j, int m, int n) {
        if (i>=m||j>=n)//leaf
            return 0;

        if (i==m-1&&j==n-1)//leaf
            return 1;

        return countPaths(i+1,j,m,n)+countPaths(i,j+1,m,n);//branch
    }

    public static void main(String[] args) {
        D3Q5a_UniquePaths uniquePaths=new D3Q5a_UniquePaths();
        int path=uniquePaths.uniquePaths(3,7);
        System.out.println(path);
    }

}

