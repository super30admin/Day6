// Time Complexity : o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :




class Solution {
    public int longestPalindrome(String s) {
        
        int result=0;
        
        HashSet<Character> set= new HashSet<>();
        
        for(char ch: s.toCharArray()){
            if(set.contains(ch)){
                result+=2;
                set.remove(ch);
            }else{
                set.add(ch);
            }
        }
        
        if(!set.isEmpty()){
            result++;
        }
        
        return result;
        
    }
}