// Time complexity: O(n) where n is the length of array.
// Space complexity: O(1).
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.*;
class LongestPalindrome {
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0) return 0;
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(set.contains(c)) {
                count = count + 2;          // Since char occurs 2 times. 
                set.remove(c);
            }
            else {
                set.add(c);
            }
        }
        if(!set.isEmpty()) {        // Odd char remains.
            count++;
        }
        return count;
    }
}