// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : I created more conditions and tried HashMap. Failed for one test case('ccc')
// This is a simpler approach. Same thought process


// Your code here along with comments explaining your approach

class Solution {
    public int longestPalindrome(String s) {
        
        // Empty input
        if (s == null || s.length() == 0) return 0;
        
        HashSet<Character> seenChars = new HashSet<>();
        int count = 0; // keep track of the length of the palindrome 
        
        for(int i = 0; i < s.length(); i++) {
            
            char x = s.charAt(i);
            
            if(!seenChars.contains(x)) {
                seenChars.add(x);
            } else {
                seenChars.remove(x);
                count += 2;
            }
        }
        
        return seenChars.size() > 0 ? count + 1 : count;
    }
}