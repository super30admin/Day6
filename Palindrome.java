// Time Complexity :O(n) n is the size of array;
// Space Complexity : O(1) since the hashset can contain on 26 letter considering only lower case is provided
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :NO


// Your code here along with comments explaining your approach



import java.util.HashSet;

class Solution {
    public int longestPalindrome(String s) {
        if(s==null || s.length()==0) return 0;
        int count =0;
        HashSet<Character> hashset = new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(hashset.contains(c))
            {
                count += 2;
                hashset.remove(c);
            }
            else 
            {
                hashset.add(c);   
            }
        }
        
        if(!hashset.isEmpty()) return count+1;
        else return count;
    }
}