package akm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class D3Q4b_Majority_ElementN3 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (hashMap.get(nums[i])==null){
                hashMap.put(nums[i],1);
            }else {
                int c=hashMap.get(nums[i])+1;
                hashMap.put(nums[i],c);
            }
        }
        for (int a : hashMap.keySet()) {
            if(hashMap.get(a)>n/3)
                ans.add(a);
        }
//        {1,2,2,2,2,3,3,3,3}}
        return ans;
    }

    public static void main(String[] args) {
        D3Q4b_Majority_ElementN3 elementN3=new D3Q4b_Majority_ElementN3();
//        int[] array = {11,33,33,11,33,11};
        int[] array = {1,1,1,2,2,2,3,3,3};//[]
        System.out.println(elementN3.majorityElement(array));
        int[] array2 = {1,1,2,2,2,2,3,3,3};//[2]
        System.out.println(elementN3.majorityElement(array2));
        int[] array3 = {1,2,2,2,2,3,3,3,3};//[2,3]
        System.out.println(elementN3.majorityElement(array3));
        int[] array4 = {2,2,2,2,3,3,3,3,3};//[2,3]
        System.out.println(elementN3.majorityElement(array4));
        int[] array5 = {1,1 ,1, 1, 1, 2, 2};//[1]
        System.out.println(elementN3.majorityElement(array5));
        int[] array6 = { 2, 2};//[2]
        System.out.println(elementN3.majorityElement(array6));
        int[] array7 = { 0,0,0};//[0]
        System.out.println(elementN3.majorityElement(array7));
        int[] array8 = {2,1,1,3,1,4,5,6};//[1]
        System.out.println(elementN3.majorityElement(array8));
    }
}
