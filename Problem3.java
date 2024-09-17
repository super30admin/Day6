// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestPalindrome(String s) {
        
        Map<Character, Integer> result = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            result.put(ch, result.getOrDefault(ch, 0)+1);            
        }
        int longestPalin = 0;
        
        boolean oddChar = false;
        
        for (int count : result.values()) {
            if (count % 2 == 0) {
                longestPalin = longestPalin + count;
            }
            else {
                oddChar = true;
                longestPalin = longestPalin + (count - 1);
            }
        }
        if (oddChar) {
            longestPalin += 1;
        }
        return longestPalin;
    }
}
