package akm;

import java.util.ArrayList;

public class D3Q5b_UniquePaths {
    //Better Solution

    private int uniquePaths(int m, int n) {
        int[][] dp = new int[m +1][n+1];
        return countPaths(0,0,m,n,dp);
    }

    private int countPaths(int i, int j, int m, int n,int[][] dp) {
        if (i>=m||j>=n)
            return 0;
        if (i==m-1&&j==n-1)
            return 1;
        if (dp[m][n] != 0)//non zero
            return dp[i][j];
        return dp[i][j]=countPaths(i+1,j,m,n,dp)+countPaths(i,j+1,m,n,dp);
    }

    public static void main(String[] args) {
        D3Q5b_UniquePaths uniquePaths=new D3Q5b_UniquePaths();
        int path=uniquePaths.uniquePaths(3,7);
//        int path=uniquePaths.uniquePaths(3,2);
        System.out.println(path);
    }
}







