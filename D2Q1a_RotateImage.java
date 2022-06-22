package akm;

public class D2Q1a_RotateImage {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int[][] dum=new int[n][n];
        for(int i=0;i<n;i++){
            for (int j = 0; j < n; j++) {
                dum[j][n-1-i]=matrix[i][j];
            }
        }
//        matrix[0][2]=69;
        for(int i=0;i<n;i++){
            for (int j = 0; j < n; j++) {
                matrix[i][j]=dum[i][j];
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        D2Q1a_RotateImage image=new D2Q1a_RotateImage();
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
