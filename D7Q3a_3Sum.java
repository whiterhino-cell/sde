package akm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class D7Q3a_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet <ArrayList< Integer >> hashSets = new HashSet < > ();

        Arrays.sort(nums);
        int i, j, k;
        for (i = 0; i < nums.length - 2; i++) {
            for (j = i + 1; j < nums.length - 1; j++) {
                for (k = j + 1; k < nums.length; k++) {
                    ArrayList< Integer > temp = new ArrayList<>() ;
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        hashSets.add(temp);
                    }
                }
            }
        }
        List <List< Integer >> ans=new ArrayList<>(hashSets);

        return ans;
    }

    public static void main(String[] args) {
        D7Q3a_3Sum sum=new D7Q3a_3Sum();

        System.out.println(sum.threeSum(new int[]{-1,0,1,2,-1,-4}));
        System.out.println(sum.threeSum(new int[]{0}));
        System.out.println(sum.threeSum(new int[]{}));
    }
}
