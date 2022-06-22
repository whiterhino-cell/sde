package akm;

import java.util.HashSet;
import java.util.Set;

public class D4Q6b_Length_of_LongestSubstringWithoutAnyRepeatingCharacter {
    public int lengthOfLongestSubstring(String s) {
        int maxAns = 0;
        Set < Character > set = new HashSet < > ();
        int l = 0;
        System.out.println(s);
        for (int r = 0; r < s.length(); r++) {
            if (set.contains(s.charAt(r))) {
                System.out.println("if  "+r+" : "+set);
                while (l < r && set.contains(s.charAt(r))) {
                    set.remove(s.charAt(l));
                    l++;
                    System.out.println("while : "+set);
                }
            }
            set.add(s.charAt(r));
            maxAns = Math.max(maxAns, r - l + 1);
        }
        return maxAns;
    }

    public static void main(String[] args) {
        D4Q6b_Length_of_LongestSubstringWithoutAnyRepeatingCharacter character=
                new D4Q6b_Length_of_LongestSubstringWithoutAnyRepeatingCharacter();

//        System.out.println(character.lengthOfLongestSubstring("abcabcbb"));
//        System.out.println(character.lengthOfLongestSubstring("abcdaaaabcbb"));
        System.out.println(character.lengthOfLongestSubstring(" "));
    }
}
//O(2n)