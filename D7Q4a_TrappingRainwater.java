package akm;

public class D7Q4a_TrappingRainwater {
    public int trap(int[] height) {
        int n = height.length;
        int waterTrapped = 0;
        for (int i = 0; i < n; i++) {
            int j = i;
            int leftMax = 0, rightMax = 0;
            while (j >= 0) {
                leftMax = Math.max(leftMax, height[j]);
                j--;
            }
            j = i;
            while (j < n) {
                rightMax = Math.max(rightMax, height[j]);
                j++;
            }
            waterTrapped += Math.min(leftMax, rightMax) - height[i];
        }
        return waterTrapped;
    }
    public static void main(String args[]) {
        D7Q4a_TrappingRainwater rainwater=new D7Q4a_TrappingRainwater();
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("The duplicate element is " + rainwater.trap(arr));
    }
}
