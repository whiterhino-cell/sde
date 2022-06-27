package akm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class D9Q2_Subsets_IIb {
    public  List<List<Integer>>  subsetsWithDup(int[] nums) {
        List < List<Integer> > ans = new ArrayList< >();
        HashSet< List<Integer> > res = new HashSet < > ();
        List < Integer > ds = new ArrayList < > ();
        fun(nums, 0, ds, res);
//        for (String it: res) {
//            ans.add(it);
//        }
        System.out.println("res : "+res);
        ans=new ArrayList<>(res);
        return ans;
    }
    public static void fun(int[] nums, int index, List < Integer > ds, HashSet < List<Integer> > res) {
        if (index == nums.length) {
            Collections.sort(ds);
            System.out.print(ds+" : "+res+" : ");
            res.add(ds);
            System.out.println(res);
            return;
        }
        ds.add(nums[index]);
        fun(nums, index + 1, ds, res);
        ds.remove(ds.size() - 1);
        fun(nums, index + 1, ds, res);
    }

    public static void main(String args[]) {
        D9Q2_Subsets_IIb subsets_ii=new D9Q2_Subsets_IIb();
        int nums[]={1,2,2};
        List < List<Integer> > ans = subsets_ii.subsetsWithDup(nums);
        System.out.println(ans);
//        printAns(ans);

    }
    static void printAns(List < String > ans) {
        System.out.println("The unique subsets are ");
        System.out.println(ans.toString().replace(",", " "));
    }
}
