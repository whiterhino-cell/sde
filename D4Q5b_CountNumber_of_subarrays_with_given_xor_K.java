package akm;

import java.util.HashMap;

public class D4Q5b_CountNumber_of_subarrays_with_given_xor_K {

    public int solve(int[] A, int target) {
        HashMap<Integer,Integer> visited = new HashMap<Integer,Integer>();
        int c = 0;
        int xorr = 0;
        int n = A.length;
        for(int i = 0;i<n;i++) {
            xorr = xorr ^ A[i];
            if(xorr == target) {
                c++;
            }
            if(visited.get(xorr^target) != null)
                c += visited.get(xorr ^ target);
            if(visited.get(xorr) != null)
                visited.put(xorr, visited.get(xorr) + 1);
            else
                visited.put(xorr, 1);
        }
        return c;
    }
    public static void main(String[] args) {
        D4Q5b_CountNumber_of_subarrays_with_given_xor_K xor_k=new D4Q5b_CountNumber_of_subarrays_with_given_xor_K();

        System.out.println(xor_k.solve(new int[]{4, 2, 2, 6, 4},6));
    }
}
