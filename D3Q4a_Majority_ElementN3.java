package akm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class D3Q4a_Majority_ElementN3 {

    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        List<Integer> ans;
        int n= nums.length,c=1;

        for (int i = 0; i < n; i++) {
            c=1;
            for (int j = i+1; j < n; j++) {
                if (nums[i]==nums[j]){
                    c++;
                }
            }
//            {1 1 1 1 1 2 2}
            if (hashMap.get(nums[i])==null&&c>n/3){
                hashMap.put(nums[i],c );
            }
        }
        ans= new ArrayList<>(hashMap.keySet());
        return ans;
    }
    public static void main(String[] args) {
        D3Q4a_Majority_ElementN3 elementN3=new D3Q4a_Majority_ElementN3();
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
    }
}
//array[] = {11,33,33,11,33,11}