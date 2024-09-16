Time Complexity: O(n)
Space Complexity: O(n)
Ran successfully on Leetcode?: Yes

class Solution {
    public int longestPalindrome(String s) {
        
        int length = 0;
        
        if(s == null || s.length() == 0) return length;
        
        HashSet<Character> set = new HashSet<Character>();
        
        for(int i = 0; i < s.length(); i++){
            
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(i));
                length += 2;
            } else {
                set.add(s.charAt(i));
            }
            
        }
        
        if(!set.isEmpty()){
            length += 1;
        }
        
        return length;
    }
}
