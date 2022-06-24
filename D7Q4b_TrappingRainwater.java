package akm;

public class D7Q4b_TrappingRainwater {
    public int trap(int[] height) {
        int n = height.length;
        int leftArr[] = new int[n];
        int rightArr[] = new int[n];
        leftArr[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftArr[i] = Math.max(leftArr[i - 1], height[i]);
        }
        rightArr[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightArr[i] = Math.max(rightArr[i + 1], height[i]);
        }
        int waterTrapped = 0;
        for (int i = 0; i < n; i++) {
            waterTrapped += Math.min(leftArr[i], rightArr[i]) - height[i];
        }
        return waterTrapped;
    }
    public static void main(String args[]) {
        D7Q4b_TrappingRainwater rainwater=new D7Q4b_TrappingRainwater();
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("The duplicate element is " + rainwater.trap(arr));
    }
}
