// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

class Solution {
    public int longestPalindrome(String s) {
        // edge case
        if(s.length()==0 || s==null) return 0;
        
        Set<Character> hs = new HashSet<>();
        
        // if char is present in hashset remove it, else just add it 
        for(int i=0; i<s.length();i++){
            if(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(i));
            }else{
                hs.add(s.charAt(i));
            }
        }
        
        if(hs.size()<=1) return s.length(); // 1)aa 2)aaa
        
        return s.length() - hs.size() +1; // abbbbc --> bbabb --> 6 - 2 +1 = 5
        
    }
}