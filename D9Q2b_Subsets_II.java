package akm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class D9Q2b_Subsets_II {
    public List < String > subsetsWithDup(int[] nums) {
        List < String > ans = new ArrayList< >();
        HashSet< String > res = new HashSet < > ();
        List < Integer > ds = new ArrayList < > ();
        fun(nums, 0, ds, res);
        for (String it: res) {
            ans.add(it);
        }
//        Collections.sort(ans);
        return ans;
    }
    public static void fun(int[] nums, int index, List < Integer > ds, HashSet < String > res) {
        if (index == nums.length) {
            Collections.sort(ds);
            res.add(ds.toString());
            return;
        }
        ds.add(nums[index]);
        fun(nums, index + 1, ds, res);
        ds.remove(ds.size() - 1);
        fun(nums, index + 1, ds, res);
    }

    public static void main(String args[]) {
        D9Q2b_Subsets_II subsets_ii=new D9Q2b_Subsets_II();
//        int nums[]={1,2,2};
        int nums[]={1,2,2,2,3,3};
        List < String > ans = subsets_ii.subsetsWithDup(nums);
        printAns(ans);

    }
    static void printAns(List < String > ans) {
        System.out.println("The unique subsets are ");
        System.out.println(ans.toString());
    }
}
