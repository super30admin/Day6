// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Y
// Any problem you faced while coding this : N


class Solution {
    public int longestPalindrome(String s) {
        
        int count =0;
        if(s==null||s.length()==0)
        {
            
            return 0;
        }    
        
        HashSet<Character> set =new HashSet<>();
        
        for(int i=0;i<s.length();i++)
        {
            if(!set.contains(s.charAt(i))){
                
                set.add(s.charAt(i));
            }
            
            else
            {
               set.remove(s.charAt(i));
                count=count+2;
                
            }   
            
        }    
        
        if(!set.isEmpty()){
                
                count= count+1;
            }
       return count; 
    }
}
