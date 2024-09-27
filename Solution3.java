// Time Complexity : O(N), where N is the length of s. 
// Space Complexity : O(1), since s consists of lowercase and/or uppercase English letters only.

import java.util.*;

class Solution3 {
    public int longestPalindrome(String s) {
        int length = 0;
        HashSet<Character> set = new HashSet<>(); 
        for (char c : s.toCharArray()) {
            // if a character is already in the set meanns we have encountered two occurences of it to make a palindrome. 
            if (set.contains(c)) {
                //  remove the character
                set.remove(c);
                // increase the length by 2
                length += 2;
            }
            // else add the character to the set. 
            else {
                set.add(c);
            }
        }
        // if set is not empty means a character can be added to maek an odd length palindrome, returning the resulting length. 
        return set.isEmpty()?length:length+1; 
    }
}
