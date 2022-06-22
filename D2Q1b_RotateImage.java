package akm;

public class D2Q1b_RotateImage {
    public void rotate(int[][] matrix) {
        int n=matrix.length;

//        Transpose
        for(int i=0;i<n/2;i++){
            for (int j = i; j < n; j++) {
                int t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }


//        ?Reverse for anticlockwise
        for(int i=0;i<n/2;i++){
            for (int j = 0; j < n; j++) {
                int t=matrix[i][j];
                matrix[i][j]=matrix[n-1-i][j];
                matrix[n-1-i][j]=t;
            }
        }

//        ?Reverse for clockwise
//        for(int i=0;i<n;i++){
//            for (int j = 0; j < n/2; j++) {
//                int t=matrix[i][j];
//                matrix[i][j]=matrix[i][n-1-j];
//                matrix[i][n-1-j]=t;
//            }
//        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        D2Q1b_RotateImage image=new D2Q1b_RotateImage();
        image.rotate(matrix);
        int n=matrix.length;

        for(int i=0;i<n;i++){
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

}
