package akm;

public class D14Q4a_LargestRectangleInHistogram {
    public int largestarea(int arr[], int n) {
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int minHeight = Integer.MAX_VALUE;
            for (int j = i; j < n; j++) {
                minHeight = Math.min(minHeight, arr[j]);
                maxArea = Math.max(maxArea, minHeight * (j - i + 1));
            }
        }
        return maxArea;
    }
    public static void main(String args[]) {
        D14Q4a_LargestRectangleInHistogram histogram=new D14Q4a_LargestRectangleInHistogram();
        int arr[] = {2, 1, 5, 6, 2, 3, 1};
        int n = 7;
        System.out.println( histogram.largestarea(arr, n)); // Printing the largest rectangle area

    }
}
