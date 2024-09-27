// Time Complexity : O(N) , N is length of string
// Space Complexity : O(1) , Maximum 26 entries into hashset
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : NA


// Your code here along with comments explaining your approach

class Solution {
    public int longestPalindrome(String s) {
        
        if (s ==  null || s.length() == 0) {
            return 0;
        } 
        
        HashSet<Character> set = new HashSet<>();
        
        int count = 0;
        
        for(int i = 0; i < s.length(); i++) {
            
            char currentChar = s.charAt(i);
            
            if(set.contains(currentChar)) {
                count += 2;
                set.remove(currentChar);
            }
            else {
                set.add(currentChar);
            }
        }
        
        if(set.size() > 0) {
            count += 1;
        }
        return count;
    }
}