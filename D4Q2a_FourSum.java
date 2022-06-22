package akm;

import java.util.*;

public class D4Q2a_FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        long tar=target;
        List<List<Integer>> ans=new ArrayList<>();
        HashMap<ArrayList<Integer>,ArrayList<Integer>> hashMap=new HashMap<>();
        Arrays.sort(nums);
        int n= nums.length;
        for (int i = 0; i < n ; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    long temp=(long)nums[i]+(long)nums[j]+(long)nums[k];

//                    System.out.println(Integer.MAX_VALUE);
//                    System.out.println((nums[i]+nums[j]+nums[k]));
//                    System.out.println(temp);
                    long num=tar-temp;
                    int l=k+1,h=n-1,m;
//                    System.out.println("temp :"+ temp);


                    while (l <= h) {
                         m = l + (h - l) / 2;

                        // Check if x is present at mid
                        if (nums[m] == num) {
                            ArrayList<Integer> keyAL=new ArrayList<>();
                            ArrayList<Integer> indexAL=new ArrayList<>();
                            Collections.addAll(keyAL,nums[i],nums[j],nums[k],nums[m]);
                            Collections.addAll(indexAL,i,j,k,m);
                            hashMap.put(keyAL,indexAL);
                        }
                        // If x greater, ignore left half
                        if (nums[m] < num)
                            l = m + 1;

                            // If x is smaller, ignore right half
                        else
                            h = m - 1;
                    }
                    //search temp using binary search;
                }
            }
        }
        for (ArrayList<Integer> key : hashMap.keySet()) {
            ans.add((key));
        }
        return ans;
    }
    public static void main(String[] args) {
        D4Q2a_FourSum sum=new D4Q2a_FourSum();
        int[] num={4 ,3 ,3 ,4 ,4 ,2 ,1 ,2 ,1, 1};
        int target=7;
        System.out.println(sum.fourSum(num,target));
        System.out.println(sum.fourSum(new int[]{1000000000,1000000000,1000000000,1000000000},-294967296));

    }
}
