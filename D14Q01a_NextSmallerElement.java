package akm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class D14Q01a_NextSmallerElement {
//    code studio
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){

        Integer[] integers = new Integer[n];
        Arrays.fill(integers, 0);
        ArrayList<Integer> nge= new ArrayList<>( Arrays.asList(integers));

        Stack< Integer > st = new Stack< >();
        for (int i = n - 1; i >= 0; i--) {
            while (st.isEmpty() == false && st.peek() >= arr.get(i)) {
                st.pop();
            }

            if (i < n) {
                if (st.isEmpty() == false)
                    nge.set(i,st.peek()) ;
                else
                    nge.set(i,-1) ;
            }

            st.push(arr.get(i));
        }
        return nge;
    }
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int nge[] = new int[n];
        Stack< Integer > st = new Stack< >();
        for (int i = n - 1; i >= 0; i--) {
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
        int arr[]={5,7,1,2,6,0};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int arr2[] = nextGreaterElements(arr);
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        ArrayList<Integer> arrayList=new ArrayList<Integer>(Arrays.asList(5,7,1,2,6,0));

        System.out.println();
        ArrayList<Integer> ans=nextSmallerElement(arrayList, arrayList.size());
        System.out.println(ans);

    }
}
