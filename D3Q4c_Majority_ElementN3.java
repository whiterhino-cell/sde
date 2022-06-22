package akm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class D3Q4c_Majority_ElementN3 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;

        int c1=0,c2=0,me1=Integer.MAX_VALUE,me2=Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (me1==nums[i]){
                c1++;
            }else if (me2==nums[i]){
                c2++;
            }else  if (c1==0){
                me1=nums[i];c1=1;
            } else if (c2==0){
                me2=nums[i];c2=1;
            }else {
                c1--;c2--;
            }
        }

        c1=0;c2=0;

        for (int i = 0; i < nums.length; i++) {
            if (me1==nums[i])c1++;
            if (me2==nums[i])c2++;
        }

        if (c1>n/3)
            ans.add(me1);
        if (c2>n/3)
            ans.add(me2);

        return ans;
    }

    public static void main(String[] args) {
        D3Q4c_Majority_ElementN3 elementN3=new D3Q4c_Majority_ElementN3();
//        Locha elementN3=new Locha();
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
        int[] array6 = { 2, 2};//[1]
        System.out.println(elementN3.majorityElement(array6));
        int[] array7 = { 0,0,0};//[1]
        System.out.println(elementN3.majorityElement(array7));
        int[] array8 = {2,1,1,3,1,4,5,6};
        System.out.println(elementN3.majorityElement(array8));
    }
}
//array[] = {11,33,33,11,33,11}
