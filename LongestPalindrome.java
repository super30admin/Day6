// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        
        HashSet<Character> set = new HashSet();
        int palindromeLength = 0;
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                palindromeLength = palindromeLength + 2;
                set.remove(ch);
            }
            else{
                set.add(ch);
            }
        }
        
        if(!set.isEmpty()){
            palindromeLength++;
        }
        
        return palindromeLength;
    }
}
