// Time Complexity : O(N) where N is the string size
// Space Complexity : O(1) because maximum size of set can only be 52 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


/*
Algorithm:
==========
1. Use hashset to store characters and if same character is in the set, increment count by 2.
2. Finally, if set is empty return count, if not return count+1 as an additional char can be added to make it large palindrome
*/

class Solution {
    
    public int longestPalindrome(String s) {
    	
    	if(s == null || s.length() == 0) return 0;
        int count = 0;
        Set<Character> set = new HashSet<>();
        
        // If set already has character, remove it and increment count by 2
        for( char c: s.toCharArray()) {
            if(!set.contains(c)) {
                set.add(c);
            }
            else {
                set.remove(c);
                count += 2;
            }
        }
        
        //If empty, count is the max palindrome size, where as if not, an extra char can be added in the middle
        return set.isEmpty()?count:count+1;
    }
}
