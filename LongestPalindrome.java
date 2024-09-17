import java.util.HashSet;

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public int longestPalindrome(String s) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (!set.contains(ch)) {
                set.add(ch);
            } else {
                count += 2;
                set.remove(ch);
            }
        }
        
        if (!set.isEmpty()) count ++;
        
        return count;
    }
}