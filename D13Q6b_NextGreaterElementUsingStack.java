package akm;

import java.util.HashMap;
import java.util.Stack;

public class D13Q6b_NextGreaterElementUsingStack {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        int nge[] = new int[n];
        Stack < Integer > st = new Stack< >();
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i = n- 1; i >= 0; i--) {
            while (st.isEmpty() == false && st.peek() <= nums2[i % n]) {
                st.pop();
            }

            if (i < n) {
                if (st.isEmpty() == false) {
                    nge[i] = st.peek();
                    hashMap.put(nums2[i],st.peek());
                }
                else {
                    nge[i] = -1;
                    hashMap.put(nums2[i],-1);
                }
            }
            st.push(nums2[i % n]);
        }
        int[] ans=new int[nums1.length];
        int i=0;
        for (int x :nums1) {
            ans[i++]=hashMap.get(x);
        }
        return ans;
    }

    public static void main(String args[]) {
        D13Q6b_NextGreaterElementUsingStack stack=new D13Q6b_NextGreaterElementUsingStack();
        int []nums1 = {2,4}, nums2 = {1,2,3,4};
        int arr2[] = stack.nextGreaterElement(new int[]{4,1,2},new int[]{1,3,4,2});
        System.out.println("The next greater elements are ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        arr2 = stack.nextGreaterElement(new int[]{2,4},new int[]{1,2,3,4});
        System.out.println("\nThe next greater elements are ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
