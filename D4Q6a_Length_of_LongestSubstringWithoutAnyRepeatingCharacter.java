package akm;

import java.util.HashSet;
import java.util.Set;
import java.util.*;
public class D4Q6a_Length_of_LongestSubstringWithoutAnyRepeatingCharacter {
    public int lengthOfLongestSubstring(String s) {
        int l=s.length();
//        if (l<2)return l;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            Set< Character > se = new HashSet< >();
            for (int j = i; j < s.length(); j++) {
                if (se.contains(s.charAt(j))) {
                    maxLen = Math.max(maxLen, j - i);
                    break;
                }
                maxLen = Math.max(maxLen, j - i+1);
                se.add(s.charAt(j));
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        D4Q6a_Length_of_LongestSubstringWithoutAnyRepeatingCharacter character=
                new D4Q6a_Length_of_LongestSubstringWithoutAnyRepeatingCharacter();

//        System.out.println(character.lengthOfLongestSubstring("abcabcbb"));
//        System.out.println(character.lengthOfLongestSubstring("abcdaaaabcbb"));
        System.out.println(character.lengthOfLongestSubstring(""));
        System.out.println(character.lengthOfLongestSubstring(" "));
        System.out.println(character.lengthOfLongestSubstring("a"));
        System.out.println(character.lengthOfLongestSubstring("au"));
        System.out.println(character.lengthOfLongestSubstring("aa"));
        System.out.println(character.lengthOfLongestSubstring("ax"));
    }

}
