package akm;

public class D3Q5bb2_UniquePaths {
    public int uniquePaths(int m, int n) {
        int [][] arr =new int[m+1][n+1];
        arr[0][1]=1;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                arr[i][j]=arr[i-1][j]+arr[i][j-1];
            }
        }
        for (int i = 0; i <=m; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(arr[i][j] +" ");

            }
            System.out.println();
        }
        return arr[m][n];
    }
    public static void main(String[] args) {
        D3Q5bb2_UniquePaths uniquePaths=new D3Q5bb2_UniquePaths();
        int path=uniquePaths.uniquePaths(3,7);
//        int path=uniquePaths.uniquePaths(53,4);
//        int path=uniquePaths.uniquePaths(56,5);
        System.out.println(path);
    }
}
