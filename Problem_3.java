// Time Complexity : O(n) where n is the length of the string
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

import java.util.*;

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(int i = 0; i < s.length(); i += 1) {
            if(!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
            } else {
                count += 2;
                set.remove(s.charAt(i));
            }
        }
        
        if(!set.isEmpty()) {
            count += 1;
        }
        return count;
    }
}