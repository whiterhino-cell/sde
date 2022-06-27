package akm;

import java.util.ArrayList;
import java.util.Collections;

public class D9Q6a_PermutationSequence {
    public String getPermutation(int n, int k) {

        String s = "";
        ArrayList < String > res = new ArrayList < > ();
        for (int i = 1; i <= n; i++) {
            s += i;
        }
        solve(s.toCharArray(), 0, res);
        Collections.sort(res);
        System.out.println(res);
        System.out.println(res.size());

        return res.get(k-1);
    }
     void swap(char s[], int i, int j) {
        char ch = s[i];
        s[i] = s[j];
        s[j] = ch;
    }
     void solve(char s[], int index, ArrayList< String > res) {
        if (index == s.length) {
            String str = new String(s);

            res.add(str);
            return;
        }
        for (int i = index; i < s.length; i++) {
            swap(s, i, index);
            solve(s, index + 1, res);
            swap(s, i, index);
        }
    }
    public static void main(String args[]) {
        D9Q6a_PermutationSequence sequence=new D9Q6a_PermutationSequence();
        int n = 3, k = 3;
//        String ans = sequence.getPermutation(n, k);
//        System.out.println("The Kth permutation sequence is " + ans);
        System.out.println(n+" "+k+" "+sequence.getPermutation(n, k));//213
        n = 4; k = 9;
        System.out.println(n+" "+k+" "+sequence.getPermutation(n, k));//2314
//        n = 9; k = 37098;
//        System.out.println(n+" "+k+" "+sequence.getPermutation(n, k));//194627853
    }

}
