// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

class Solution {
    public int longestPalindrome(String s) {
        
    HashSet<Character> set = new HashSet<>();
    int result = 0;
        
        for(int i =0; i< s.length();i++){
            
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(i));
                result += 2 ;
            }else{
                set.add(s.charAt(i));
            }
        }
        
        if(!set.isEmpty()){
           result++; 
        }
        
        return result;
    }
}