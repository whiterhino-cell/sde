package akm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class D7Q5a_RemoveDuplicates_in_placeFromSortedArray {
    public int removeDuplicates(int[] nums) {
        HashSet < Integer > set = new HashSet < > ();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int ans = set.size();
        ArrayList<Integer> arrayList=new ArrayList<>(set);
        Collections.sort(arrayList); // kya huaa

        int j = 0;
        for (int x: arrayList) {
            nums[j++] = x;
        }
        return ans;
    }
    public static void main(String[] args) {
        D7Q5a_RemoveDuplicates_in_placeFromSortedArray array=new D7Q5a_RemoveDuplicates_in_placeFromSortedArray();
//        int arr[] = {1,1,2,2,2,3,3};
        int arr[] = {-3,-1,0,0,0,3,3};
        int k = array.removeDuplicates(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
