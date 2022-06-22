package akm;

import java.util.Arrays;

public class D1Q1B_SetMatrixZero {
    public void setZeros(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int dummy1[] = new int[m];
        int dummy2[] = new int[n];
        Arrays.fill(dummy1,-1);
        Arrays.fill(dummy2,-1);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    dummy1[i]=0;
                    dummy2[j]=0;

                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                if (dummy1[i]==0 || dummy2[j]==0) matrix[i][j] = 0;
        }
    }
    public static void main(String args[]) {
        int arr[][] = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};

//        int arr[][] = {{1, 1, 1, 1}, {1, 0, 1, 1}, {1, 1, 0, 1}, {0, 0, 0, 1}};
//          int arr[][] = {{1,1,1,0}, {1,0,1,0}, {1,1,0,0}, {1,1,1,1}};


        D1Q1B_SetMatrixZero zero = new D1Q1B_SetMatrixZero();

        zero.setZeros(arr);
        System.out.println("The Final Matrix is ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}


