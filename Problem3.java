// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

// Use set to save the character
// If we encounter a character saved in the set, we pair it and increment count, and remove it from the set
// At the end we check set to see if it's empty, if not, we add one to the count or size 

class Solution {
    public int longestPalindrome(String s) {
        
        // TC: O(n)
        // SC: O(1) -> as there are 26 unique characters
        int count = 0;
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(set.contains(c)) {
               count += 2;
                set.remove(c);
            }
            else {
                set.add(c);
            }
        }
        
        if(!set.isEmpty()) {
            count++;
        }
        
        return count;
    }
}