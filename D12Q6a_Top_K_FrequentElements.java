package akm;

import java.util.*;

public class D12Q6a_Top_K_FrequentElements {
    public  int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

//        System.out.println(map);
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
                new PriorityQueue<>((a, b)->(b.getValue()-a.getValue()));
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            maxHeap.add(entry);
        }
//        System.out.println(maxHeap);
        int res[]=new int[k],i=0;
        while(i<k){
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
//            System.out.println(entry.getKey()+" : "+i);
            res[i]=(entry.getKey());
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        D12Q6a_Top_K_FrequentElements sortedArrays=new D12Q6a_Top_K_FrequentElements();
        int []ans =sortedArrays.topKFrequent(new int[]{1,1,1,2,2,3},2);
        for (int x :ans) {
            System.out.print(x+" ");
        }
    }
}
