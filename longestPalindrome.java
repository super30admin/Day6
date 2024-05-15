// Time Complexity : O(n)
// Space Complexity : O(1) at max it can be 56 characters + maybe if the add ascii values. But it is constant space.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int longestPalindrome(String s) {
        
        HashSet<Character> set=new HashSet<>();
        
        int result=0;
        
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            
            if(set.contains(c))
            {
                result+=2;
                set.remove(c);
            }
            else
                set.add(c);
        }
        
        return (set.size()>0)?result+1:result;
    }
}