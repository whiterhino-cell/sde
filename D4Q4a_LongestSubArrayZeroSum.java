package akm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D4Q4a_LongestSubArrayZeroSum {
    public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
//        System.out.println((arr));
        int count=0,maxCount=0;
        int n=arr.size(),sum=0;

        for (int i = 0; i < n; i++) {
            sum=0;count=0;
            for (int j = i; j < n; j++) {
                sum+=arr.get(j);
                count++;
//                System.out.println(count);
                if (sum==0){
                    maxCount=Math.max(count,maxCount);
                }
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {

        D4Q4a_LongestSubArrayZeroSum zeroSum=new D4Q4a_LongestSubArrayZeroSum();

        int num[]={9, -3, 3, -1, 6, -5};
//        ArrayList<Integer> nums=new ArrayList<Integer>(Arrays.asList(15,-2,2,-8,1,7,10,23)) ;//5
//        ArrayList<Integer> nums=new ArrayList<Integer>(Arrays.asList(9, -3, 3, -1, 6, -5)) ;//5
//        ArrayList<Integer> nums=new ArrayList<Integer>(Arrays.asList(6,-2,2,-8,1,7,4,-10)) ;//8
//        ArrayList<Integer> nums=new ArrayList<Integer>(Arrays.asList(1, 0, -5)) ;//1
//        ArrayList<Integer> nums=new ArrayList<Integer>(Arrays.asList(1, 3, -5, 6, -2)) ;//0
//        int ans=zeroSum.LongestSubsetWithZeroSum(nums);
//        System.out.println(ans);

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
