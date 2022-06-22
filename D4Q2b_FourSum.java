package akm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class D4Q2b_FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        long tar=target;
        List<List<Integer>> quad=new ArrayList<>();
        Arrays.sort(nums);
        int n= nums.length;
        for (int i = 0; i < n ; i++) {
            for (int j = i+1; j < n; j++) {

                long t2=tar-(long)(nums[i]+nums[j]);
                int front=j+1,back=n-1;
                while (front<back){
                    int s2=nums[front]+nums[back];
                     if (s2==t2){
                        ArrayList<Integer> an=new ArrayList<>();
//                         Collections.addAll(an,nums[i],nums[j],nums[front],nums[back]);
                        an.add(nums[i]);//0
                        an.add(nums[j]);//1
                        an.add(nums[front]);//2
                        an.add(nums[back]);//3
                        quad.add(an);
                         while (front<back&&an.get(2)==nums[front])front++;// skip front
                         while (front<back&&an.get(3)==nums[back])back--;// skip back
                    }else if (s2<t2){
                         front++;
                     }else {
                         back--;
                     }
//                    System.out.println("bum");
                }while (j+1<n&&nums[j+1]==nums[j])j++;//skip j
            }while (i+1<n&&nums[i+1]==nums[i])i++;    //skip i
        }
        return quad;
    }
    public static void main(String[] args) {
        D4Q2b_FourSum sum=new D4Q2b_FourSum();
        D4Q2a_FourSum sum1=new D4Q2a_FourSum();
        int[] num={4 ,3 ,3 ,4 ,4 ,2 ,1 ,2 ,1, 1};
        int target=7;
        System.out.println(sum.fourSum(num,target));
        System.out.println(sum.fourSum(new int[]{1000000000,1000000000,1000000000,1000000000},-294967296));

    }
}
//[[0, 1, 2, 7], [1, 2, 4, 5], [2, 3, 4, 4]]
