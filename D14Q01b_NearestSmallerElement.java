package akm;

import java.util.Stack;

public class D14Q01b_NearestSmallerElement {
    public int[] prevSmaller(int[] nums) {
        int n = nums.length;
        int nge[] = new int[n];
        Stack< Integer > st = new Stack< >();
        for (int i =0; i <n; i++) {
            while (st.isEmpty() == false && st.peek() >= nums[i % n]) {
                st.pop();
            }

            if (i < n) {
                if (st.isEmpty() == false) nge[i] = st.peek();
                else nge[i] = -1;
            }

            st.push(nums[i % n]);
        }
        return nge;
    }
    public static void main(String args[]) {
        D14Q01b_NearestSmallerElement element=new D14Q01b_NearestSmallerElement();
        int arr[]={4, 5, 2, 10, 8}; //-1, 4, -1, 2, 2

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int arr2[] = element.prevSmaller(arr);
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
