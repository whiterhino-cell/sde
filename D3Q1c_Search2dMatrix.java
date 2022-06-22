package akm;

public class D3Q1c_Search2dMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int l = 0, h = n * m - 1, mid;
        while (h >= l) {
            mid = (l + h) / 2;
            int i = mid / n;
            int j = mid % n;

            if (target == matrix[i][j])
                return true;
            else if (target < matrix[i][j]) {
                h = mid - 1;
            } else if (target > matrix[i][j]) {
                l = mid + 1;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        D3Q1c_Search2dMatrix dmatrix=new D3Q1c_Search2dMatrix();
        int [][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
//        int [][] matrix={{10,20,30,40},{11,21,36,43},{25,29,39,50},{50,60,70,80}};
        int target = 23;
        if (dmatrix.searchMatrix(matrix,target))
            System.out.println("found");
        else
            System.out.println("not found");
    }
}
