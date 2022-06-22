package akm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class D4Q6c_Length_of_LongestSubstringWithoutAnyRepeatingCharacter {
    public int lengthOfLongestSubstring(String s) {
        HashMap< Character, Integer > hashMap = new HashMap<>();

        int left = 0, right = 0;
        int n = s.length();
        int len = 0;
        while (right < n) {
            if (hashMap.containsKey(s.charAt(right)))
                left = Math.max(hashMap.get(s.charAt(right)) + 1, left);

            hashMap.put(s.charAt(right), right);

            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }
    public static void main(String[] args) {
        D4Q6c_Length_of_LongestSubstringWithoutAnyRepeatingCharacter character=
                new D4Q6c_Length_of_LongestSubstringWithoutAnyRepeatingCharacter();

//        System.out.println(character.lengthOfLongestSubstring("abcabcbb"));
//        System.out.println(character.lengthOfLongestSubstring("abcdaaaabcbb"));
        System.out.println(character.lengthOfLongestSubstring(""));
        System.out.println(character.lengthOfLongestSubstring(" "));
        System.out.println(character.lengthOfLongestSubstring("a"));
        System.out.println(character.lengthOfLongestSubstring("au"));
        System.out.println(character.lengthOfLongestSubstring("aa"));
        System.out.println(character.lengthOfLongestSubstring("ax"));
//
    }
}
