package akm;

public class D1Q1A_SetMatrixZero {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int a[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = 0;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    for (int k = 0; k < m; k++) if (matrix[k][j] != 0) a[k][j] = -1;
                    for (int k = 0; k < n; k++) if (matrix[i][k] != 0) a[i][k] = -1;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                if (a[i][j] == -1) matrix[i][j] = 0;
        }
    }

    public static void main(String args[]) {
//         int arr[][] = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};

        int arr[][] = {{1, 1, 1, 1}, {1, 0, 1, 1}, {1, 1, 0, 1}, {0, 0, 0, 1}};
//          int arr[][] = {{1,1,1,0}, {1,0,1,0}, {1,1,0,0}, {1,1,1,1}};


        D1Q1A_SetMatrixZero zero = new D1Q1A_SetMatrixZero();

        zero.setZeroes(arr);
        System.out.println("The Final Matrix is ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}