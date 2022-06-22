package akm;

public class D3Q1a_Search2dMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length, n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (target == matrix[i][j]) return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        D3Q1a_Search2dMatrix dmatrix=new D3Q1a_Search2dMatrix();
        int [][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int [][] matrix2={{10,20,30,40},{11,21,36,43},{25,29,39,50},
                {50,60,70,80}};
        int target = 3;
        if (dmatrix.searchMatrix(matrix,target))
            System.out.println("found");
        else
            System.out.println("not found");
    }
}
