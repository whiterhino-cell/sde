package akm;
import java.util.*;
public class D1Q1C_SetMatrixZero {
    public static void setZeroes(int[][] matrix) {
        int bool = 1, m = matrix.length, n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) bool = 0;
            for (int j = 1; j < n; j++)
                if (matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 1; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
            if (bool == 0) matrix[i][0] = 0;
        }
    }




    public static void main(String args[]) {
        int arr[][] = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};

//        int arr[][] = {{1,1,1,1}, {1,0,1,1}, {1,1,0,1}, {0,0,0,1}};
//        int arr[][] = {{1,1,1,0}, {1,0,1,0}, {1,1,0,0}, {1,1,1,1}};

        setZeroes(arr);
        System.out.println("The Final Matrix is ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}


