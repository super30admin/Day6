// Time Complexity : linear
// Space Complexity : constant
// Did this code successfully run on Leetcode : y
// Any problem you faced while coding this : n
class Solution {
    public int longestPalindrome(String s) {
        
        boolean[] seen = new boolean[256];
        int ans = 0;
        
        for(char c: s.toCharArray()) {
            seen[c] = seen[c] ^ true;
            if(!seen[c]) ans+=2;
        }
        
        return s.length() > ans ? ans + 1 : ans;
    }
}