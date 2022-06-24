package akm;

import java.util.*;

public class D7Q3b_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        int n= nums.length;
        HashSet <ArrayList< Integer >> hashSets = new HashSet < > ();
        HashMap<Integer ,Integer> hashMap=new HashMap<>();

//        Arrays.sort(nums);
        for (int x :nums) {
            if (hashMap.containsKey(x)){
                hashMap.put(x,(int)(hashMap.get(x))+1);
            }else
                hashMap.put(x,1);
        }
//        System.out.println(hashMap);
        for (int i = 0; i < n ; i++) {
            int a=nums[i];
            hashMap.put(a,(int)(hashMap.get(a))-1);
            for (int j = i+1; j < n; j++) {
                int b=nums[j];
                hashMap.put(b,(int)(hashMap.get(b))-1);
                if (hashMap.containsKey(-(a+b))&&hashMap.get(-(a+b))>0){
//                    System.out.println(a+" "+b+" "+(-(a+b))+" : "+hashMap.get(-(a+b)));
                    ArrayList<Integer> hashMap1=new ArrayList<>(Arrays.asList(a,b,(-(a+b))));
                    Collections.sort(hashMap1);
                    hashSets.add(hashMap1);
                }

                hashMap.put(b,(int)(hashMap.get(b))+1);
            }
            hashMap.put(a,(int)(hashMap.get(a))+1);
        }

        System.out.println(hashMap);
        List<List<Integer>> ans=new ArrayList<>(hashSets);
        return ans;
    }

    public static void main(String[] args) {
        D7Q3b_3Sum sum=new D7Q3b_3Sum();

        System.out.println(sum.threeSum(new int[]{-1,0,1,2,-1,-4}));
//        System.out.println(sum.threeSum(new int[]{0}));
//        System.out.println(sum.threeSum(new int[]{}));
    }
}
