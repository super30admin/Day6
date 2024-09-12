// Problem 3: 

// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int longestPalindrome(String s) {
        
        if(s.length() == 0 && s == null) return 0;
        
        HashSet<Character> set = new HashSet<Character>();
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(set.contains(ch)) {
                count += 2;
                set.remove(ch);
            } else {
                set.add(ch);
            }
        }
        if(!set.isEmpty()) count++;
        return count;
    }
}