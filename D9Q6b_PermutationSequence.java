package akm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class D9Q6b_PermutationSequence {
    public String getPermutation(int n, int k) {
        int fact = 1;
        List<Integer> numbers = new ArrayList<>();
        for(int i = 1;i<n;i++) {
            fact = fact * i;
            numbers.add(i);
        }
        numbers.add(n);
        String ans = "";
        k = k - 1;
        while(true) {
            ans = ans + numbers.get(k / fact);
            numbers.remove(k / fact);
            if(numbers.size() == 0) {
                break;
            }

            k = k % fact;
            fact = fact / numbers.size();
        }
        return ans;
    }

    public static void main(String args[]) {
        D9Q6b_PermutationSequence sequence=new D9Q6b_PermutationSequence();
        int n = 3, k = 3;
//        String ans = sequence.getPermutation(n, k);
//        System.out.println("The Kth permutation sequence is " + ans);
        System.out.println(n+" "+k+" "+sequence.getPermutation(n, k));//213
        n = 4; k = 9;
        System.out.println(n+" "+k+" "+sequence.getPermutation(n, k));//2314
        n = 9; k = 37098;
        System.out.println(n+" "+k+" "+sequence.getPermutation(n, k));//194627853
    }

}
