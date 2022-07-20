package akm;

public class D14Q4aa_LargestRectangleInHistogram {
    public int largestarea(int arr[], int n) {
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int j=0,k=0;
            for ( j = i; j >=0; j--) {
                if (arr[j]<arr[i])break;
            }
            for ( k = i; (k < n)&&(arr[k]>=arr[i]); k++) ;
            maxArea = Math.max(maxArea, arr[i] * (k - j - 1));
        }
        return maxArea;
    }
    public static void main(String args[]) {
        D14Q4aa_LargestRectangleInHistogram histogram=new D14Q4aa_LargestRectangleInHistogram();
        int arr[] = {2, 1, 5, 6, 2, 3, 1};
        int n = 7;
        System.out.println( histogram.largestarea(arr, n)); // Printing the largest rectangle area

    }
}
