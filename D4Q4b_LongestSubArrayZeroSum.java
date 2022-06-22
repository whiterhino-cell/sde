package akm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class D4Q4b_LongestSubArrayZeroSum {
    public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
        int count=0,maxCount=0;
        int n=arr.size(),sum=0;

        HashMap<Integer,Integer> ds=new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum+=arr.get(i);
            if (sum==0){
                count=i+1;
            }else if (ds.get(sum)==null){
                ds.put(sum,i);
            }else {
                count=i-ds.get(sum);
            }
            maxCount=Math.max(maxCount,count);
        }
        return maxCount;
    }

    public static void main(String[] args) {

        D4Q4b_LongestSubArrayZeroSum zeroSum=new D4Q4b_LongestSubArrayZeroSum();

        int num[]={9, -3, 3, -1, 6, -5};
        ArrayList<Integer> nums1=new ArrayList<Integer>(Arrays.asList(15,-2,2,-8,1,7,10,23)) ;//5
        ArrayList<Integer> nums2=new ArrayList<Integer>(Arrays.asList(9, -3, 3, -1, 6, -5)) ;//5
        ArrayList<Integer> nums3=new ArrayList<Integer>(Arrays.asList(6,-2,2,-8,1,7,4,-10)) ;//8
        ArrayList<Integer> nums4=new ArrayList<Integer>(Arrays.asList(1, 0, -5)) ;//1
        ArrayList<Integer> nums5=new ArrayList<Integer>(Arrays.asList(1, 3, -5, 6, -2)) ;//0
        System.out.println(zeroSum.LongestSubsetWithZeroSum(nums1));
        System.out.println(zeroSum.LongestSubsetWithZeroSum(nums2));
        System.out.println(zeroSum.LongestSubsetWithZeroSum(nums3));
        System.out.println(zeroSum.LongestSubsetWithZeroSum(nums4));
        System.out.println(zeroSum.LongestSubsetWithZeroSum(nums5));
    }
}
