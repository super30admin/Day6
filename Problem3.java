// Time Complexity :O (s)
// Space Complexity : O(s)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this :No



import java.util.HashSet;

class Solution {
    public int longestPalindrome(String s) {
        
    if(s.length()==0 || s==null)
        return -1;

    // Have set to add and delete occurences. once u delete char , add count by 2 . At end , if set size is not empty,add 1
    HashSet<Character>cSet=new HashSet<>();
    int count=0;
    
    for(int i=0;i<s.length();i++)
    {
        char ch=s.charAt(i);
        if(cSet.contains(ch))
        {
            count+=2;
            cSet.remove(ch);
        }
        else
        {
            cSet.add(ch);
        }
    }
    
    if(cSet.size()>0)
        count++;
        
    return count;
    }
}