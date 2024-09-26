
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach: Used hashset to add the values. if we have 2 values of same character remove from hashset and add count by two. In the end if the set is not empty add count by one

import java.util.HashSet;

class Solution {
    public int longestPalindrome(String s) {

        HashSet<Character> hs = new HashSet<>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (!hs.contains(s.charAt(i))) {
                hs.add(s.charAt(i));
            } else {
                hs.remove(s.charAt(i));
                count = count + 2;
            }
        }
        if (!hs.isEmpty())
            count++;
        return count;
    }
}