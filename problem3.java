// Time Complexity : O(N)
// Space Complexity : O(1) because our character set is A-Z and a-z. Hence, space is constant
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
class Solution {
    public int longestPalindrome(String s) {
        
        if(s == null || s.length() == 0)
            return 0;
        
        Set<Character> set = new HashSet<>();
        int count = 0;
        
        for(char c: s.toCharArray()){
            
            if(!set.contains(c)){
                set.add(c);
            } else {
                count += 2;
                set.remove(c);
            }
        }
        
        return set.isEmpty()? count: count+1;
    }
}
